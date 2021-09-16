package com.spring.wefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.placeboard.service.IPlaceBoardService;
import com.spring.wefit.util.PageCreator;
import com.spring.wefit.util.PageVO;

@Controller
@RequestMapping("/location")
public class PlaceBoardController {

	@Autowired 
	private IPlaceBoardService service;
	
	//��� ��� ȭ��
	@GetMapping("/placeList")
	public String placeList(Model model) {
		System.out.println("/board/dietList: GET");
		model.addAttribute("placeList", service.getList());
		return "/board/location/loc_board";
	}
	
		
	//�۾��� ȭ�� ó��
	@GetMapping("/placeWrite")
	public String placeWrite() {
		System.out.println("/loc_write ��û");
		return "/board/location/loc_write";
	}
	

	//�� ��� ó��
	@PostMapping("/placeWrite")
	public String placeWrite(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/placeWrite: POST");
		service.regist(vo);
		ra.addFlashAttribute("msg", "���� ��� ó���Ǿ����ϴ�.");
			
		return "redirect:/board/location/loc_board"; //��� �Ŀ� �� ��� ��û���� �����̷�Ʈ
	}

	
	//�� �󼼺��� ó��
	@GetMapping("/loc_detail")
	public String placeContent(@RequestParam int pbNum, Model model) {
		System.out.println("/board/placeContent: GET");
		System.out.println("��û�� �� ��ȣ: " + pbNum);
		
		model.addAttribute("placeList", service.getContent(pbNum));
		return "";
	}
		
			
	//�� ���� ������ �̵�
	@GetMapping("/loc_modify")
	public void modify(@RequestParam int pbNum, Model model) {
		System.out.println("/board/placeModify: GET");
		System.out.println("��û�� �� ��ȣ: " + pbNum);
		
		model.addAttribute("placeList", service.getContent(pbNum));
	}
		
	//�� ���� ó��
	@PostMapping("/placeUpdate")
	public String placeUpdate(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/placeUpdate: POST");
		service.update(vo);
		ra.addFlashAttribute("msg", "���� ���� ó���Ǿ����ϴ�.");
			
		return "redirect:/location/loc_detail?pbNum=" + vo.getPbNum();
	}
	
	//�� ���� ó��
	@PostMapping("/placeDelete")
	public String placeDelete(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/placeUpdate: POST");
		service.delete(vo.getPbNum());
		ra.addFlashAttribute("msg", "�Խñ��� ���� �����Ǿ����ϴ�.");
			
		return "redirect:/board/location/loc_board";
	}	
		
	
	
	
}

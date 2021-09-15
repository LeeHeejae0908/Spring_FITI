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
	@GetMapping("/loc_board")
	public String placeList(PageVO vo, Model model) {
		
		PageCreator pc = new PageCreator();
		pc.setPaging(vo);
		pc.setArticleTotalCount(service.getTotal(vo));
			
		model.addAttribute("boardList", service.getList(vo));
		model.addAttribute("pc", pc);
				
		return "board/location/loc_board";
	}
		
	//�۾��� ȭ�� ó��
	@GetMapping("/loc_write")
	public void placeRegist() {}
	
	//�� ��� ó��
	@PostMapping("/registForm")
	public String registForm(PlaceBoardVO vo, RedirectAttributes ra) {
		service.regist(vo);
			
		//��� ���� ���θ� 1ȸ������ �����ϱ� ���� ra��ü�� �޼���
		ra.addFlashAttribute("msg", "���� ��� ó���Ǿ����ϴ�.");
			
		return "redirect:/location/loc_board"; //��� �Ŀ� �� ��� ��û���� �����̷�Ʈ
	}
		
	//�� �󼼺��� ó��
	@GetMapping("/loc_detail")
	public void getContent(@RequestParam int pbNum, Model model, 
							@ModelAttribute("p") PageVO vo) {
	model.addAttribute("article", service.getContent(pbNum));
	}
		
	//�� ���� ������ �̵�
	@GetMapping("/loc_modify")
	public void modify(@RequestParam int pbNum, Model model) {
		model.addAttribute("article", service.getContent(pbNum));
	}
		
	//�� ���� ó��
	@PostMapping("/placeUpdate")
	public String placeUpdate(PlaceBoardVO vo, RedirectAttributes ra) {
		service.update(vo);
		ra.addFlashAttribute("msg", "updateSuccess");
			
		return "redirect:/location/loc_detail?pbNum=" + vo.getPbNum();
	}
	
	//�� ���� ó��
	@PostMapping("/placeDelete")
	public String placeDelete(PlaceBoardVO vo, RedirectAttributes ra) {
		service.delete(vo.getPbNum());
			
		ra.addFlashAttribute("msg", "�Խñ��� ���� �����Ǿ����ϴ�.");
			
		return "redirect:/location/loc_board";
	}	
		
	
	
	
}

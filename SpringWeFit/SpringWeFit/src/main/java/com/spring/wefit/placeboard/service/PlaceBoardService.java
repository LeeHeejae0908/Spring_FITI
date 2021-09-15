package com.spring.wefit.placeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.placeboard.mapper.IPlaceBoardMapper;
import com.spring.wefit.util.PageVO;


@Service
public class PlaceBoardService implements IPlaceBoardService{

	@Autowired
	private IPlaceBoardMapper mapper;

	@Override
	public void regist(PlaceBoardVO vo) {
		mapper.regist(vo);
	}

	@Override
	public List<PlaceBoardVO> getList(PageVO vo) {
		
		List<PlaceBoardVO> list = mapper.getList(vo);
		
		for(PlaceBoardVO article : list) {
			//���� �ð� �о����
			long now = System.currentTimeMillis();
			//�� �Խù����� �ۼ��ð� �о���� (�и���)
			long regTime = article.getPbRegDate().getTime();
			
			/*��Ʋ�� ������ �ʾҴ��� ���ؼ� newMark�� true�� ó��
			if(now - regTime < 60 * 60 * 24 * 2 * 1000) {
				article.setNewMark(true);
			}
			*/
		}	
		return list;
	}

	@Override
	public int getTotal(PageVO vo) {
		return mapper.getTotal(vo);
	}

	@Override
	public PlaceBoardVO getContent(int pbNum) {
		return mapper.getContent(pbNum);
	}

	@Override
	public void update(PlaceBoardVO vo) {
		mapper.update(vo);
		
	}

	@Override
	public void delete(int pbNum) {
		mapper.delete(pbNum);
		
	}


	
}

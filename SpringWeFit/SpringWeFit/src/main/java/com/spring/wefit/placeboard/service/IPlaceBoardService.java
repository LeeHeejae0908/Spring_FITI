package com.spring.wefit.placeboard.service;

import java.util.List;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.util.PageVO;

public interface IPlaceBoardService {

	//�Ĵ� �� ���
	void regist(PlaceBoardVO vo);

	//�Ĵ� �� ���
	List<PlaceBoardVO> getList(PageVO vo);

	//�Ĵ� �� �Խù� ��
	int getTotal(PageVO vo);

	//�Ĵ� �� �󼼺���
	PlaceBoardVO getContent(int pbNum);

	//�Ĵ� �� ����
	void update(PlaceBoardVO vo);

	//�Ĵ� �� ����
	void delete(int pbNum);

	Object getList();
	
	

}

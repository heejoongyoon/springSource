package kr.or.ddit.freeboard.service;

import java.util.List;

import kr.or.ddit.freeboard.vo.FreeboardVO;

public interface FreeboardService {
	//메소드 시그니처
	public List<FreeboardVO> list() throws Exception;
}

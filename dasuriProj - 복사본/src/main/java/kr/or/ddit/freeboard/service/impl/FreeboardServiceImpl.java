package kr.or.ddit.freeboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.freeboard.mapper.FreeboardMapper;
import kr.or.ddit.freeboard.service.FreeboardService;
import kr.or.ddit.freeboard.vo.FreeboardVO;

@Service
public class FreeboardServiceImpl implements FreeboardService {
	@Autowired
	FreeboardMapper freeboardMapper;
	
	@Override
	public List<FreeboardVO> list() throws Exception{
		return freeboardMapper.list();
	}
}




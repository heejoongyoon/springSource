package kr.or.ddit.freeboard.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.freeboard.service.FreeboardService;
import kr.or.ddit.freeboard.vo.FreeboardVO;

@Controller
public class FreeboardController {
	private static Logger logger = LoggerFactory.getLogger(FreeboardController.class);
	
	@Autowired
	FreeboardService freeboardService;
	
	//자유게시판 목록(계층형)
	@RequestMapping(value="/freeboard/list",method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		
		List<FreeboardVO> freeboardVo = this.freeboardService.list();
		
		logger.info("freeboardVo : " + freeboardVo);
		
		model.addAttribute("freeboardVo", freeboardVo);
		
		//forwarding
		return "freeboard/list";
	}
	
	@RequestMapping(value="/freeboard/insert",method=RequestMethod.GET)
	public String insert() {
		//forwarding
		return "freeboard/insert";
	}
	
	@RequestMapping(value="/freeboard/insert",method=RequestMethod.POST)
	public String insertPost(@ModelAttribute FreeboardVO freeboardVo) {
		//redirect
		return "redirect:/freeboard/detail?num=1";
	}
	
	//location.href = "/freeboard/detail?rnum="+rnum;
	@RequestMapping(value="/freeboard/detail",method=RequestMethod.GET)
	public String detail(@RequestParam String rnum) {
		//select
		
		//forwarding
		return "freeboard/detail";
	}
}






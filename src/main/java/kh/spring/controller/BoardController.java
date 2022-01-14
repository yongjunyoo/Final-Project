package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dto.BoardDTO;
import kh.spring.service.BoardService;

@RequestMapping("/board/")
@Controller
public class BoardController {

	@Autowired
	BoardService bService;
	
	@RequestMapping("main") // 메인으로 이동.
	public String main(Model model) {
		List<BoardDTO> list = bService.selectList();
		model.addAttribute("list",list);
		return "/board/boardMain";
	}
	
	@RequestMapping("write") // 글쓰기로 이동.
	public String boardWrite() {
		return "/board/boardWrite";
	}
	
	@RequestMapping("detail") // 글 클릭시 글 세부내용으로 이동.
	public String boardDetail() {
		return "/board/boardDetail";
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception e) {
		e.printStackTrace();
		return "redirect:/";
	}
}
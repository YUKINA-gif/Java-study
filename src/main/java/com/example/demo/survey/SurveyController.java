package com.example.demo.survey;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@GetMapping("/form")
	public String form(SurveyForm surveyForm,Model model) {
		model.addAttribute("title", "アンケート調査");
		return "survey/form";
	}
	
	@PostMapping("/form")
	public String formGoBack(SurveyForm surveyForm,Model model) {
		model.addAttribute("title", "アンケート調査");
		return "survey/form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@Validated SurveyForm surveyForm,Model model,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("title", "アンケート調査");
			return "survey/form";
		}
		model.addAttribute("title", "アンケート調査");
		return "survey/confirm";
	}
	
	@PostMapping("/complete")
	public String complete(@Valid @ModelAttribute SurveyForm surveyForm,BindingResult result, Model model,RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("title", "アンケート調査");
			return "survey/form";
		}
		redirectAttributes.addFlashAttribute("complete","アンケートのご協力ありがとうございました");
		return "redirect:/survey/form";
	}
	
}

package com.moretolearn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplatesController {
	
	// From Static Folder
	@GetMapping("/")
	public String initStatic() {
		return "forward:/index.html";
	}
		
	// From Templates/invoiceapp Folder
	@GetMapping("/angular")
	public String initAngular() {
		return "browser/index";
	}
		
	// From Templates Folder
	@GetMapping("/thyme1")
	public String initThymeleaf() {
		return "index";
	}

	// From webapp/WEB-INF/jsp Folder
	@GetMapping("/jsp")
	public String jsp() {
		return "jsp/index";
	}

	// From Templates/thymeleaf Folder
	@GetMapping("/thyme")
	public String thymeleaf(Model model) {
		model.addAttribute("message", "Welcome to the Demo using Thymeleaf!");
		return "thymeleaf/index"; 
	}
	
	// From Templates/freemarker Folder
	@GetMapping("/free")
	public String freemarker(Model model) {
		model.addAttribute("message", "Welcome to the Demo using Freemarker!");
		return "freemarker/index"; 
	}
	
	// From Templates/groovy Folder
	@GetMapping("/groovy")
	public String groovy(Model model) {
		model.addAttribute("message", "Welcome to the Demo using Groovy");
		return "groovy/index"; 
	}
	
	// From Templates/mustache Folder
	@GetMapping("/mustache")
	public String mustache(Model model) {
		model.addAttribute("message", "Welcome to the Mustache Demo!");
		return "mustache/index"; 
	}
}

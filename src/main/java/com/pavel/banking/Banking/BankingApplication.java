package com.pavel.banking.Banking;

import com.pavel.banking.Banking.model.CurrencyRate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BankingApplication {

	@RequestMapping("/graph")
	public String drawGraph(Model model){
//		model.addAttribute(rate crp.findAll());
//		model.addAttribute(rate, crp.findAll());
		return "index";
	}


	@RequestMapping("/")
	public @ResponseBody
	String root() {
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}

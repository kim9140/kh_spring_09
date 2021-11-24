package com.mycompany.myapp09.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp09.model.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping(value = "idCheck",method = RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam ("id") String id) {
		System.out.println("id: ->"+ id);
		String check = null;
		try {
			int result = 0;
			result = memberservice.idCheck(id);
			if(result > 0) {
				check = "false";
			}
			else
				check = "true";
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return check;
	}
	
}

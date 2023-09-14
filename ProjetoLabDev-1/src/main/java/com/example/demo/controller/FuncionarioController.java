package com.example.demo.controller;

import java.sql.Connection;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Funcionario;
import com.example.demo.model.FuncionarioDAO;
import com.example.demo.services.DB;

@Controller
public class FuncionarioController {
	
	@Autowired
	FuncionarioDAO dao;
	
	
	
	@GetMapping("/")
	public String home() {
		Connection con = DB.connect();
		return "index.html";
	}
	
	@GetMapping("/func")
	public String getfunc() {
		return "test2.html";
	}

}

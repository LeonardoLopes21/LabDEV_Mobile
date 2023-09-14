package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
	public String nome;
	public String cargo;
	public String turno;
	public String cpf;
	
}

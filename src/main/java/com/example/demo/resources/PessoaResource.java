package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Pessoa;
import com.example.demo.repository.PessoaRepository;


@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public List<Pessoa> listarTodos(){
		return pessoaRepository.findAll();
	}
}

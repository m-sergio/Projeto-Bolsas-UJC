package com.UJC.bolsa.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.UJC.bolsa.Service.CandidatoService;
import com.UJC.bolsa.Service.EscolaService;
import com.UJC.bolsa.Service.ProvinciaService;
import com.UJC.bolsa.domain.Candidato;
import com.UJC.bolsa.domain.Escola;
import com.UJC.bolsa.domain.Provincia;

@Controller
public class ApplicationController {
	
	
	//Controllers do Candidato
	@Autowired
	private CandidatoService service;
	
	
	@Autowired
	private ProvinciaService prov;
	
	@Autowired
	private EscolaService esc;
	
	//abrir pagina de candidatura
	@GetMapping("/candidatura/cadastrar")
	public String cadastrar(Candidato candidato) {
		return "/candidato/formulario";
	}
	
	
	//Abrir pagina de consulta
	
	@GetMapping("/candidatura/consultar")
	public String consultar(Candidato candidato) {
		return "/candidato/page_Consulta";
	}
	
	
	//Abrir pagina de configuracao de perfil
	
	
	@GetMapping("/candidatura/configPerfil")
	public String configPerfil(Candidato candidato) {
		return "/candidato/configPerfil";
		//return "/funcionario/pageCentral";
	}
	
	
	
		
	
	//Salvar dados do formulario
	
	@PostMapping("/candidatura/salvar")
	public ResponseEntity<?> salvar(Candidato candidato) {
		
		
		service.salvar(candidato);
		service.generateReport();
		return ResponseEntity.ok().build();
	}
	
	@ModelAttribute("provincias")
	public List<Provincia> getProvincias(){
		return prov.buscarTodos();
	}
	
	
	 @ModelAttribute("escolas")
	public List<Escola> getEscolas(){
		return esc.buscarTodos();
	}
	 
	 //Controllers do Login
	 

		//abrir pagina loginCandidato
		@GetMapping("/login")
		public String login() {
			
			return "/loginCandidato/login";
		}
		
		
		//registrar conta
		@GetMapping("/registrar")
		public String registrarConta() {
			
			return "/loginCandidato/register";
		}
		
		// login invalido
				@GetMapping({"/loginError"})
				public String loginError(ModelMap model) {
					
					model.addAttribute("fail","Login ou senha incorretos, tente novamente.");
		
					
					return "/loginCandidato/login";
				}
		
		
		//sair pagina loginCandidato
			@GetMapping("/candidatura/logout")
			public String logout() {
				
				return "/loginCandidato/login";
			}
			

}

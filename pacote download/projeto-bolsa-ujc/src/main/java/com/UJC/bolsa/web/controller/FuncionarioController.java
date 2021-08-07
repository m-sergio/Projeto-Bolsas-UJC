package com.UJC.bolsa.web.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.UJC.bolsa.Dao.EstadoCandidatoDao;
import com.UJC.bolsa.Service.CandidatoService;
import com.UJC.bolsa.Service.EstadoCandidadatoService;
import com.UJC.bolsa.Service.EstudanteService;
import com.UJC.bolsa.domain.Candidato;
import com.UJC.bolsa.domain.Estadocandidato;
import com.UJC.bolsa.domain.Estudante;

@Controller
public class FuncionarioController {
	
	@Autowired
	private EstudanteService est;
	
	@Autowired
	private EstadoCandidadatoService es;
	
	@Autowired
	private CandidatoService service;
	
	//Controllers do Funcionario
	
	//Abrir a pagina de lista de candidatos
	@GetMapping("/page/listarCandidatos")
	public String listarCandidatos() {
		return "funcionario/pageCentral";
	}
	
	
	//Abrir a pagina de relatorios
	@GetMapping("/page/Relatorios")
	public String relatorios() {
		return "funcionario/pageRelatorio";
	}
	
	//Abrir a pagina de configuracaoPerfil
	@GetMapping("/page/configPerfil")
	public String configPerfil() {
		return "funcionario/configPerfil";
	}
	
	@PostMapping("/addEstado")
	public String addEstado(Estudante estudante) {
		
	est.salvar(estudante);
	
	return "funcionario/pageCentral";
	
	}
	
	
	
	@ModelAttribute("estudantes")
	public List<Estudante> getEstudantes(){
		return est.buscarTodos();
	}
	
	 @ModelAttribute("estado")
		public List<Estadocandidato> getEstados(){
			return es.buscarTodos();
		}
}

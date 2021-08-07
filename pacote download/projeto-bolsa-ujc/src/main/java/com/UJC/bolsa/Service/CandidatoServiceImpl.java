package com.UJC.bolsa.Service;

import java.util.List;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UJC.bolsa.Dao.CandidatoDao.CandidatoDao;
import com.UJC.bolsa.domain.Candidato;

@Service
@Transactional(readOnly = false)
public class CandidatoServiceImpl implements CandidatoService {

	@Autowired
	private CandidatoDao dao;

	@Override
	public void salvar(Candidato candidato) {
		dao.save(candidato);

	}

	@Override
	public void editar(Candidato candidato) {
		dao.update(candidato);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Candidato buscarPorId(Long id) {

		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Candidato> buscarTodos() {

		return dao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public String generateReport() {
		try {
			List<Candidato> cand = dao.findAll();
			
		
		//	String reportPath = "D:\\";
			
			JasperReport report = JasperCompileManager.compileReport("/relatorio.jrxml");
			
			JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(cand);
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("Criado por"," UJC");
			
			JasperPrint print = JasperFillManager.fillReport(report, parameters, datasource);
			
			 JasperExportManager.exportReportToPdfFile(print,"relatorio.pdf");
			System.out.println("Impresso");
			
			return "Report sucessfully generated";
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return "Error ---> check console log";
		}
		
	}

}

package com.UJC.bolsa.web.controller.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.UJC.bolsa.Service.ProvinciaService;
import com.UJC.bolsa.domain.Provincia;

@Component
public class StringToProvinciaConverter implements Converter<String, Provincia>  {
	
	@Autowired
	private ProvinciaService service;

	@Override
	public Provincia convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}

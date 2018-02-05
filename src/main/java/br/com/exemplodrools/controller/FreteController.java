package br.com.exemplodrools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplodrools.model.Frete;
import br.com.exemplodrools.service.FreteService;

@RestController
@RequestMapping("/frete")
public class FreteController {
	
	@Autowired
	private FreteService freteService;

	@GetMapping(value = "/calcula-frete", produces = MediaType.APPLICATION_JSON_VALUE)
	public Double calculaFrete(@RequestParam Double distancia) {		
		Frete frete = new Frete();
		frete.setDistancia(distancia);		
		freteService.calculaFrete(frete);		
		return frete.getCalculo();
	}
}

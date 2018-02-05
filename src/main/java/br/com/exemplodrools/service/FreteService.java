package br.com.exemplodrools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.exemplodrools.model.Frete;

@Service
public class FreteService {	
	
	@Autowired
	private KieContainer kieContainer;	
	
	public Frete calculaFrete(Frete frete) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(frete);
		kieSession.fireAllRules();
		kieSession.dispose();
		return frete;
	}

}

package br.com.agenda.transferencia.financeira.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.agenda.transferencia.financeira.service.ServiceAgendaTransferenciaFinanceira;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ControllerAgendaTransferenciaFinanceira {	
	private final ServiceAgendaTransferenciaFinanceira service;

	@PostMapping
	public ResponseEntity<Object> postMethodAgendaTransferenciaFinanceira(@RequestBody Object entity) {
		service.SalvarTransferenciaFinanceira();
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@GetMapping
	public ResponseEntity<List<Object>>  getListAgendaTransferenciaFinanceira() {
		service.ListarTransferenciasFinanceirasAgendadas();
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
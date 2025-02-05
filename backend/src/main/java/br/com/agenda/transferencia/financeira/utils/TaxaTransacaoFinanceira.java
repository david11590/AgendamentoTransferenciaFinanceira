package br.com.agenda.transferencia.financeira.utils;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import org.springframework.stereotype.Component;

@Component
public class TaxaTransacaoFinanceira {	
	public BigDecimal calculaTaxaAgendaFinanceira(Temporal dataInicio, Temporal dataFim, BigDecimal valor) {
		long dias = ChronoUnit.DAYS.between(dataInicio,dataFim);
		if(dias==0) {
			return new BigDecimal("3").add(valor.multiply(new BigDecimal("0.025")));
		}else if(dias>=1 || dias<10) {
			return new BigDecimal("12");
		}else if(dias>=11 ||dias<20) {
			return valor.multiply(new BigDecimal("0.082"));
		}else if(dias>=21 ||dias<30) {
			return valor.multiply(new BigDecimal("0.069"));
		}else if(dias>=31 ||dias<40) {
			return valor.multiply(new BigDecimal("0.047"));
		}else if(dias>=41 ||dias<50) {
			return valor.multiply(new BigDecimal("0.017"));
		}else {
			return null;
		}
	}
}

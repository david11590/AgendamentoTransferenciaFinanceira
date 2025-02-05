package br.com.agenda.transferencia.financeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.agenda.transferencia.financeira.model.TransacaoFinanceira;

public interface RepositoryAgendaTransferenciaFinanceira extends JpaRepository<TransacaoFinanceira, Long>{}
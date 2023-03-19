package com.algaworks.algalog.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Entrega {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;
	private Destinatario destinatario;
	private BigDecimal taxa;
	private StatusEntrega status;
	private LocalDateTime dataPedido;
	private LocalDateTime dataFinalizada;
}

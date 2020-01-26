package com.example.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.di.modelo.Cliente;
import com.example.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
//	@Autowired
	private Notificador notificador; 

	@Autowired
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
	}	
	public AtivacaoClienteService(String qualquer) {
		
	}
	
	public void ativar (Cliente cliente) {
			cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
//	
	
}

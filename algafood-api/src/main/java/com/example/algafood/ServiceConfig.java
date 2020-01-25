package com.example.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.algafood.di.notificacao.Notificador;
import com.example.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}

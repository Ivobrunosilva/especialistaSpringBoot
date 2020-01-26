package com.example.algafood.di.notificacao;


import org.springframework.stereotype.Component;

import com.example.algafood.di.modelo.Cliente;
@Component
public class NotificadorEmail implements Notificador{
	@Override
	public void notificar(Cliente cliente, String menssagem) {		
		System.out.printf("Notificando %s atraves de SMTP %s usando SMTP %s: %s\n",cliente.getNome(), cliente.getEmail(), menssagem);
	}
	
}

package com.example.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.example.algafood.di.modelo.Cliente;
@Component
public class NotificadorEmail implements Notificador{
	 
		
	public  NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String menssagem) {
		System.out.printf("Notificando %s atraves do email %s: %s\n",cliente.getNome(), cliente.getEmail(), menssagem);
	}
}

package com.example.algafood.di.notificacao;


import com.example.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador{
	 private boolean caixaAlta;
	 private String hostServidorSmtp;
	 
	public  NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String menssagem) {
		if(this.caixaAlta) {
			menssagem = menssagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s atraves de SMTP %s usando SMTP %s: %s\n",cliente.getNome(), cliente.getEmail(),this.hostServidorSmtp, menssagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}

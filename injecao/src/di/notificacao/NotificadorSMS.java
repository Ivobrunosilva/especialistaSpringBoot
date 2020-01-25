package di.notificacao;

import di.modelo.Cliente;

public class NotificadorSMS implements Notificador {
	@Override
	public void notificar(Cliente cliente, String menssagem) {
		System.out.printf("notifica��o %s por SMS atrav�s do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone());
		
	}
}

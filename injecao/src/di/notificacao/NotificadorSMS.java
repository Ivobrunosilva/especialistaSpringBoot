package di.notificacao;

import di.modelo.Cliente;

public class NotificadorSMS implements Notificador {
	@Override
	public void notificar(Cliente cliente, String menssagem) {
		System.out.printf("notificação %s por SMS através do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone());
		
	}
}

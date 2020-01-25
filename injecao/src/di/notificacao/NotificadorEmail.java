package di.notificacao;

import di.modelo.Cliente;

public class NotificadorEmail implements Notificador{
	@Override
	public void notificar(Cliente cliente, String menssagem) {
		System.out.printf("Notificando %s atraves do email %s: %s\n",cliente.getNome(), cliente.getEmail(), menssagem);
	}
}

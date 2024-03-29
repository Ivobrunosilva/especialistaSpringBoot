package di.service;

import di.modelo.Cliente;
import di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador; 

	public void ativacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar (Cliente cliente) {
			cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

package di;

import di.modelo.Cliente;
import di.notificacao.Notificador;
import di.notificacao.NotificadorEmail;
import di.service.AtivacaoClienteService;

public class Main {
	public static void main(String [] args) {
		Cliente joao = new Cliente("Jo�o", "joao@xyz.com", "8998889898");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "56654845");
		
		Notificador notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	} 
}

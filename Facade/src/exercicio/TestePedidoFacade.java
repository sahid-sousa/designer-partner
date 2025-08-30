package exercicio;

public class TestePedidoFacade {
	public static void main(String[] args) {
		
		/*
		 * Facade
		 * Prover uma interface simplificada para a utilização de várias interfaces de um subsistema
		 */
		
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		Pedido pedido = new Pedido("Notebook ", " Rafael Cosentino ", "Av Brigadeiro Faria Lima , 1571 , São Paulo , SP ");
		facade.registraPedido(pedido);
	}
}

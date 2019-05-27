import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {
	
	private String acao = "";
	
	public void frente() {
		acao = "frente";
		System.out.println("carro roubado segue em frente");
		this.mudaEstado();
	}
	public void direita() {
		acao = "direita";
		System.out.println("carro roubado segue em direita");
		this.mudaEstado();
	}
	public void esquerda() {
		acao = "esquerda";
		System.out.println("carro roubado segue em esquerda");
		this.mudaEstado();
	}
	public void para() {
		acao = "para";
		System.out.println("carro roubado para");
		this.mudaEstado();
	}
	
	
	
	public void mudaEstado() {
		setChanged(); //mudou o estado, metodo da classe Observable
		notifyObservers(acao); //Notifica os observadores
	}
}

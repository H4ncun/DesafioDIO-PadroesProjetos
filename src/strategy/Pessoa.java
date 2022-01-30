package strategy;



public class Pessoa {
	
	private Acao acao;
	
	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public void mover() {
		acao.mover();
	}
	
	public void parar() {
		acao.parar();
	}

}

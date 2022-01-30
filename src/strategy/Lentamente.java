package strategy;

public class Lentamente implements Acao {
	
	@Override
	public void mover() {
		System.out.println("Movendo-se lentamente.");}
	
		@Override
		public void parar() {
			System.out.println("Parando de se mover lentamente.");
		
	}

}


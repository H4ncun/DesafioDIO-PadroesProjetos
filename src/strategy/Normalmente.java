package strategy;

public class Normalmente implements Acao {
	
	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente.");}
	
		@Override
		public void parar() {
			System.out.println("Parando de se mover normalmente.");
		
	}

}


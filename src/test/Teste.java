package test;

import facade.Facade;
import strategy.Acao;
import strategy.Pessoa;
import strategy.Lentamente;
import strategy.Normalmente;
import strategy.Rapidamente;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Teste Singleton");
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println("Teste Facade");
		
		Facade facade = new Facade();
		facade.migrarCliente("Teste", "12345678");
		
		System.out.println("Teste Strategy");		
		
		Acao lentamente = new Lentamente();
		Acao normalmente = new Normalmente();
		Acao rapidamente = new Rapidamente();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setAcao(normalmente);
		pessoa.mover();
		pessoa.mover();
		pessoa.parar();
		pessoa.mover();
		pessoa.setAcao(lentamente);
		pessoa.mover();
		pessoa.parar();
		pessoa.setAcao(rapidamente);
		pessoa.mover();
		pessoa.mover();
		pessoa.parar();
		
		

	}

}

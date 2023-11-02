package banco;
import modelos.Conta;
public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando um conta
		Conta a=new Conta("Conta 1");
		
		System.out.println(a.toString());
		//utilizando metodo 
		a.depositar(200);
		System.out.println(a.toString());
		a.depositar(150);
		System.out.println(a.toString());
		
		Conta b=new Conta("Conta 2");
		System.out.println(b.toString());
		
	}

}

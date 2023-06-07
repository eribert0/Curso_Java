
public class condicional_ternaria {

	public static void main(String[] args) {
		
        double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;	
		
		/*if(preco < 20.00){
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}*/
		
		System.out.println("valor do desconto: "+desconto);
	}

}

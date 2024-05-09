public class Continue {
	public static void main(String[] args) {
        /*ja aqui mesmo com a condicao ele continua, imprime 1, 2, pula o 3 e continua ate o 5. */
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);	
	}
    }
}

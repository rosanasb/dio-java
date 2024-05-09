public class Break {
	public static void main(String[] args) {
	/*como tem a condicao ali dentro o que o break faz eh continuar a iteracao
     * ate a condicao do if ser true e para a iteracao do for.
     */
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);	
	}
    }
}

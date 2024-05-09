public class ExemploFor {
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
        //OU
        System.out.println("----------------------------");
        int carneirinhos = 1;
        /*os pontos-e-vírgulas são usados para separar essas três partes,
         mesmo que uma ou mais delas estejam vazias.
         a primeira parte está vazia porque a variável carneirinhos já foi inicializada
        anteriormente, mas ainda é necessário o ponto-e-vírgula para separar 
        essa parte da condição de continuação. */
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
	}
}


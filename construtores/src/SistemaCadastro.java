public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
		//System.out.println(marcos.getEndereco());
	}
}

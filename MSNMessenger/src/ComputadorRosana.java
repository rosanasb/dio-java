import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class ComputadorRosana {
	public static void main(String[] args) {
		
		/*MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();*/
        //polimorfismo
        ServicoMensagemInstantanea smi = null;
                
        /*
            NÃO SE SABE QUAL APP 
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */
        String appEscolhido="tlg"; 
                
        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
                
                    
        smi.enviarMensagem();
        smi.receberMensagem();
	}
}

/**
 * <h1>Usuario</h1>
 * A classe simular e mostrar as ações de um usuário usando uma smartTV 
 * <p>
 * <b>Note:</b> use os métodos da classe SmartTv para usar no método main desta classe
 * 
 * @author Mauro
 * @since 30/05/2024
 */

public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new  SmartTv();
        //ações do usuário
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.escolherCanal(8);
        //----------------------------------------------------
        //Resultados
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        
    }
}

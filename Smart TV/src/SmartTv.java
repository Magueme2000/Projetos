/**
 * <h1>SmartTv</h1>
 * A classe simular uma smartTV e as ações que ela pode executar
 * <p>
 * <b>Note:</b> use os métodos aqui para usar na classe usuário
 * 
 * @author Mauro
 * @since 30/05/2024
 */

public class SmartTv {
    //status iniciais da smartTV
    boolean ligada = false;
    int canal = 1;
    int volume = 1;
}
public void ligar(){
    /**ações de ligar a smartTV */
    ligada = true;
}
public void desligar(){
    /**ações de desligar a smartTV */
    ligada = false; 
}
//-------------------------------------------------------------------------------
public void escolherCanal(int numeroDoCanal){
    /**ações de trocar de canal
     * @param numeroDoCanal o valor do novo canal escolhido pelo usuário
     */
    canal = numeroDoCanal;
}
public void avancarCanal(){
    /**ações de avançar de canal*/
    canal++;
}
public void retrocederCanal(){
    /**ações de retroceder de canal*/
    canal--;
}
//-------------------------------------------------------------------------------
public void aumentarVolume(){
    /**ações de aumentar volume*/
    volume++;
}
public void diminuirVolume(){
    /**ações de diminir de volume*/
    volume--;
}
public class SmartTv {
    //status principais e iniciais da TV
    boolean ligada = false;
    int canal = 1;//quando o usuário decidir digite o número do canal
    int volume = 1;
    //ações de ligar e desligar a TV
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false; 
    }
    //ações de trocar de canal
    public void escolherCanal(int numeroDoCanal){
        canal = numeroDoCanal;
    }
    public void avancarCanal(){
        canal = ++canal;
    }
    public void retrocederCanal(){
        canal = 1-canal;
    }
    //ações de volume
    public void aumentarVolume(){
        volume = ++volume;
    }

    public void diminuirVolume(){
        volume = 1-volume;
    }
}
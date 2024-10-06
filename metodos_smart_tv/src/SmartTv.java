public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;
    
    public void ligar (){
        ligada = true;
    }
    
    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }
    
    public void reduzirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal alterado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal alterado para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal selecionado: " + novoCanal);
    }
}
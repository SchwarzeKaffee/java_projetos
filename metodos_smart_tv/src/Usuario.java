public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTV = new SmartTv();
        
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Volume atual: " + smartTV.volume);
        System.out.println("Canal atual: " + smartTV.canal);
        
        smartTV.ligar();
        System.out.println("Após apertar o botão ligar, a TV se encontra ligada?  " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.diminuirCanal();

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();

        smartTV.reduzirVolume();

        smartTV.mudarCanal(15);

        smartTV.desligar();
        System.out.println("Após apertar o botão desligar, a TV se encontra ligada?  " + smartTV.ligada);
    }
}

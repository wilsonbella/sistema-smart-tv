public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(7);

        System.out.println("Canal Atual : " + smartTv.canal);

        //System.out.println("TV está ligada ? " + smartTv.ligada);
        //System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Status atual -> TV está ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status atual -> TV está ligada ? " + smartTv.ligada);
    }
}

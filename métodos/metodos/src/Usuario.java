public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // Ligar a TV antes de alterar o canal
        System.out.println("Ligando a TV...");
        smartTv.ligar();

        // Alterar canal (DEVE FUNCIONAR AGORA)
        System.out.println("Alterando canal para 5...");
        smartTv.alterarCanal(5);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume");

        // Exibir status atualizado
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}

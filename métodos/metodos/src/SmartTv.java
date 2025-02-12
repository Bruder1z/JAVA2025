public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
        } else {
            System.out.println("A TV está desligada! Ligue-a para mudar de canal.");
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            canal--;
        } else {
            System.out.println("A TV está desligada! Ligue-a para mudar de canal.");
        }
    }

    // Certifique-se de que este método existe com o argumento int
    public void alterarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
        } else {
            System.out.println("A TV está desligada! Ligue-a para mudar de canal.");
        }
    }
}

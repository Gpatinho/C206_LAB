public class Mago extends Personagem {


    public Mago(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Energia: " + getEnergia());
        System.out.println("Poder: " + getPoder());
    }

    // No caso do mago o que esta acontecendo é que o "@override" torna essa clase unica para o mago já que o mago não esta fazendo parte dessas clases
@Override
public void usarHabilidade(){
        System.out.println("Ataque do Mago!");
        System.out.println("Usando Magia!");
        System.out.println("Katon jutsu Bola de fogo");
        System.out.println();

    }

}

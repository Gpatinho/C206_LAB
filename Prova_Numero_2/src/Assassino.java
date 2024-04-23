public class Assassino extends Personagem implements LutarComArma {

    Arma arma = new Arma(); // como se fossee um atributo, criar no topo da class

    public Assassino(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Energia: " + getEnergia());
        System.out.println("Poder: " + getPoder());
    }

  /*  public void atacar() {
        System.out.println("Ataque do assassino!");
        System.out.println("CHIDORI");
        System.out.println();
    } */

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("O " + getNome() + " está usando arma para atacar o " + personagem.getNome());
    }
}
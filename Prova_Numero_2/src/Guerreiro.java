public class Guerreiro extends Personagem implements LutarComArma {

    Arma arma = new Arma(); // como se fossee um atributo, criar no topo da class

    public Guerreiro(String nome, int vida, int energia, int poder,int dano, String nomeArma) {
        super(nome, vida, energia, poder);
        arma.setNomeArma(nomeArma);
        arma.setDano(dano);
    }
 public void mostraInfo(){
     System.out.println("Nome: " + getNome());
     System.out.println("Vida: " + getVida());
     System.out.println("Energia: " + getEnergia());
     System.out.println("Poder: " + getPoder());
 }
 /*   public void atacar(){
        System.out.println("Ataque do Guerreiro!");
        System.out.println("Kamehamehaaaa");
        System.out.println();
    } */

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("O " + getNome() + " está usando " + arma.getNomeArma() + " para atacar ");
    }

    @Override
    public void tiravida(){
        System.out.println(arma.getNomeArma() + " Tirou " + arma.getDano() + " de dano do vagabundo " );
    }
}

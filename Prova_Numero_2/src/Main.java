public class Main {

    public static void main (String[] args){

        Personagem personagem = new Personagem("guto",1,2,3); // serve de bode expiatorio

        Mago mago = new Mago("Dumbledore",100,1000,90);

        Assassino assassino = new Assassino("Kakashi",100,500,10);

        Guerreiro guerreiro = new Guerreiro("Vegeta",100,8000,20);

        personagem.addpersonagem(mago);
        personagem.addpersonagem(assassino);
        personagem.addpersonagem(guerreiro);

        personagem.mostraInfo();











    }
}

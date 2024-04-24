public class Main {
    public static void main(String[] args) {
        // instanciação de um exercito novo
        Exercito exercito = new Exercito("Exercito vida rasa Patinho");

        // instanciação de cada Soldado, um de cada tipo
        Sargento s1 = new Sargento("Patinho", 442157171, "Arma Três oitão", "Papinho de augustinho", 8000);
        Oficial o1 = new Oficial("Anna da Roça", 111111111, null, "Major");
        MedicoMilitar mm1 = new MedicoMilitar("Lara da Roça", 222222222, "KIT- Boiadeira", 20, 3);

        // atribuindo cada soldado ao meu novo exercito
        exercito.addSoldado(s1);
        exercito.addSoldado(o1);
        exercito.addSoldado(mm1);

        // chamada o método mostraInfo da classe exercito
        exercito.mostraInfo();

    }
}
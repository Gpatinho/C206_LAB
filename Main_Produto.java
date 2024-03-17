public class Main_Produto {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.codigoSerie = 0001;
        p1.codigoProduto = "x";
        p1.categoria = "Limpeza";
        p1.nome = "Lustramovel";
        p1.quantidade = 10;

        p2.codigoSerie = 0002;
        p2.codigoProduto = "y";
        p2.categoria = "Banheiro";
        p2.nome = "champo";
        p2.quantidade = 3;

        p1.mostraInfo();
        p2.mostraInfo();



    }


}

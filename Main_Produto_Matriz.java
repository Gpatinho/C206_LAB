public class Main_Produto_Matriz {
    public static void main(String [] args){

        double valortotal;

        Carrinho_Matriz c1 = new Carrinho_Matriz();
        Produto_Matriz p1 = new Produto_Matriz();
        Produto_Matriz p2 = new Produto_Matriz();
        Produto_Matriz p3 = new Produto_Matriz();

        p1.nome = "Bolacha";
        p1.descricao = "Biscoito recheado";
        p1.fabricante = "Passa-tempo";
        p1.preco = 3;

        p2.nome = "Chocolate";
        p2.descricao = "cacau em po";
        p2.fabricante = "Nestle";
        p2.preco = 10;

        p3.nome = "danone";
        p3.descricao = "Leite viscoso";
        p3.fabricante = "Danete";
        p3.preco = 5;

        c1.addproduto(p1);
        c1.addproduto(p2);
        c1.addproduto(p3);

        c1.exibirInfos();
        valortotal = c1.calculaTotal();
        System.out.println(valortotal);



    }
}

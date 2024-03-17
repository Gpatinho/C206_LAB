public class Carrinho_Matriz {
    double total;
    Produto_Matriz[]produtos = new Produto_Matriz[3];
    void addproduto(Produto_Matriz Novoproduto){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = Novoproduto;
                break;
            }
        }
    }
    void exibirInfos(){
        for (Produto_Matriz produto : produtos){
            System.out.println(produto.nome);
            System.out.println(produto.descricao);
            System.out.println(produto.fabricante);
            System.out.println(produto.preco);
            System.out.println();
        }

    }
    double calculaTotal(){
        for(Produto_Matriz produto : produtos){
            total += produto.preco;
        }
    return total;
    }

}

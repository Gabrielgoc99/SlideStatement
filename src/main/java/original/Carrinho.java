package original;

public class Carrinho {

    public float calcularValor(Produto produto){
        float conta;
        float precoEncomenda = produto.getPreco();
        int qtdeEncomenda = produto.getQtdeProduto();

        conta = precoEncomenda * qtdeEncomenda;
        return conta;
    }


}

package original;

public class Carrinho {
    float conta;

    public float calcularValor(Produto produto){
        float precoEncomenda = produto.getPreco();
        int qtdeEncomenda = produto.getQtdeProduto();

        conta = precoEncomenda * qtdeEncomenda;
        return conta;
    }


}

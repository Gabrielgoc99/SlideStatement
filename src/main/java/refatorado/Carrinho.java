package refatorado;

public class Carrinho {

    public float calcularValor(Produto produto){
        float precoEncomenda = produto.getPreco();
        int qtdeEncomenda = produto.getQtdeProduto();

        float conta;
        conta = precoEncomenda * qtdeEncomenda;
        return conta;
    }


}

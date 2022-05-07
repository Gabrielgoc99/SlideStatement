package refatorado;

import org.junit.jupiter.api.Test;
import original.Carrinho;
import original.Produto;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void calcularValor() {
        original.Produto produto = new Produto("Arroz", 10.99f);
        produto.setQtdeProduto(2);
        original.Carrinho carrinho = new Carrinho();

        assertEquals(21.98f, carrinho.calcularValor(produto));
    }
}
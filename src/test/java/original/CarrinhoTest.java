package original;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void calcularValor() {
        Produto produto = new Produto("Arroz", 10.99f);
        produto.setQtdeProduto(2);
        Carrinho carrinho = new Carrinho();

        assertEquals(21.98f, carrinho.calcularValor(produto));
    }
}
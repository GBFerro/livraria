package livraria.produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos.add(produto);
        this.total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
}
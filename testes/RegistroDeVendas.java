package livraria.testes;


import livraria.Autor;
import livraria.produtos.CarrinhoDeCompras;
import livraria.produtos.Ebook;
import livraria.produtos.LivroFisico;
import livraria.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNomeAutor("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNomeLivro("Test-Driven Development");
        fisico.setValor(69.9);
        
        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNomeLivro("Test-Driven Development");
        ebook.setValor(49.9);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        List<Produto> produtos = carrinho.getProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("Total: R$ " + carrinho.getTotal());
    }
}
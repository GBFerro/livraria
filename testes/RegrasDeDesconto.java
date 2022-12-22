package livraria.testes;

import livraria.*;
import livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNomeAutor("Robert Langdon");

        // Livro livro = new LivroFisico(autor);
        // livro.setValor(59.9);

        // Ebook ebook = new Ebook(autor);
        // ebook.setValor(49.9);

        // MiniLivro livro = new MiniLivro(autor);
        // livro.setValor(39.9);
    
        // System.out.println("Valor atual: " + livro.getValor());

        // if (!livro.aplicaDescontoDe(0.30)) {
        //     System.out.println("porcentagem não pode ser maior que 30%");
        // } else {
        //     System.out.println("valor com desconto: " + livro.getValor());
        // }

        // System.out.println("Valor atual: " + ebook.getValor());

        // if (!ebook.aplicaDescontoDe(0.1)) {
        //     System.out.println("porcentagem não pode ser maior que 15%");
        // } else {
        //     System.out.println("valor com desconto: " + ebook.getValor());
        // }
    }
}
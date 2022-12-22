package livraria.testes;

import livraria.*;
import livraria.produtos.Ebook;
import livraria.produtos.LivroFisico;

public class CadastroDeLivro{

    public static void main(String[] args){
        Autor autor = new Autor();
        autor.setNomeAutor("Rodrigo Faro");
        autor.setEmailAutor("faro.rodrigo@hotmail.com");
        autor.setCpfAutor("123.456.789-10");

        LivroFisico livro = new LivroFisico(autor);
        livro.setNomeLivro("Java 8 prático");
        livro.setDescricaoLivro("Novos recursos da Linguagem");
        livro.setValor(69.9);
        livro.setisbnLivro("978-85-66250-46-6");

        livro.toString();

        Ebook ebook = new Ebook(autor);
        ebook.setNomeLivro("Python 3 prático");
        ebook.setDescricaoLivro("Matplotlib, numpy e pandas");
        ebook.setValor(49.9);
        ebook.setisbnLivro("123-22-45678-56-6");

        System.out.println(ebook);
    }
}
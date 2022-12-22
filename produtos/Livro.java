package livraria.produtos;

import livraria.*;
import livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor){

        if (autor == null) {
            throw new AutorNuloException(
                "O autor do livro não pode ser nulo");
        }
        this.isbn = "000-00-00000-00-0";
        this.autor = autor;
    }

    @Override
    public String toString(){
        System.out.println("Mostrando detalhes do livro: ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");
        
        if (this.temAutor()){
            autor.toString();
        }
        
        System.out.println("--");

        return null;
    }

    @Override
    public int compareTo(Produto outro) {

        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setNomeLivro(String nome){
        this.nome = nome;
    }

    String getNomeLivro(){
        return this.nome;
    }

    public void setDescricaoLivro(String descricao){
        this.descricao = descricao;
    }

    String getDescricaoLivro(){
        return this.descricao;
    }

    public void setisbnLivro(String isbn){
        this.isbn = isbn;
    }

    String getisbnLivro(){
        return this.descricao;
    }

    void setAutorLivro(Autor autor){
        this.autor = autor;
    }

    Autor getAutorLivro(){
        return this.autor;
    }

}




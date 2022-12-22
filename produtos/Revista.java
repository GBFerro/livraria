package livraria.produtos;

import livraria.Editora;

public class Revista implements Produto, Promocional {

    private Editora editora;
    private String nome;
    private String descricao;
    private double valor;

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto na Revista");
        return true;
    }

    void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    void setNomeRevista(String nome){
        this.nome = nome;
    }

    String getNomeRevista(){
        return this.nome;
    }

    void setDescricaoRevista(String descricao){
        this.descricao = descricao;
    }

    String getDescricaoRevista(){
        return this.descricao;
    }

    void setEditora(Editora editora){
        this.editora = editora;
    }

    Editora getEditora(){
        return this.editora;
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
}
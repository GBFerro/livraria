package livraria.produtos;

import livraria.*;

public class Ebook extends Livro implements Promocional{

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    // public Ebook(){
    //     super();
    // }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no Ebook");
        return true;
    }

    @Override
    public String toString() {
        return "Eu sou um Ebook";
    }
    
}
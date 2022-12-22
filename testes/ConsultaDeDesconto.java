package livraria.testes;

import livraria.produtos.GerenciadorDeCupons;

public class ConsultaDeDesconto {

    public static void main(String[] args) {

        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.validaCupom("CAB11");

        if (desconto != null) {
            System.out.println("Cupom de desconto válido");
            System.out.println("Valor: " + desconto + "%");

        } else {
            System.out.println("Esse cupom não existe");
        }
    }
}

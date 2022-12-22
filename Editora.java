package livraria;

public class Editora {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    String getNomeFantasia(){
        return this.nomeFantasia;
    }

    void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    String getrazaoSocial(){
        return this.razaoSocial;
    }

    void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    String getCnpj(){
        return this.cnpj;
    }
}
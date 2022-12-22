package livraria;

public class Autor{
    
    private String nome;
    private String email;
    private String cpf;

    @Override
    public String toString(){

        System.out.println("Mostrando detalhes do autor: ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        return null;
    }

    String getNomeAutor(){
        return this.nome;
    }

    public void setNomeAutor(String nome){
        this.nome = nome;
    }

    String getEmailAutor(){
        return this.email;
    }

    public void setEmailAutor(String email){
        this.email = email;
    }

    String getCpfAutor(){
        return this.cpf;
    }

    public void setCpfAutor(String cpf){
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);

    }
}
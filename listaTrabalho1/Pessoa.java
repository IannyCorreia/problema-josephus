package listaTrabalho1;

public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String endereço;

    public Pessoa(String nome, String telefone, String cpf,String endereço){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereço = endereço;
    }
    public String toString(){
        return  nome + telefone +  cpf  + endereço; 
    }
}

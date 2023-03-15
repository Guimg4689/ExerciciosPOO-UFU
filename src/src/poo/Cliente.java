package poo;


public class Cliente {
    String nome, cpf, telefone;
    int idade;


    void cadastraCliente(String name, String cpf, int idade, String telefone) {
        this.nome = name;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;

    }

    void mostraCliente(){
        System.out.println("Nome: " + this.nome + " Cpf: " + this.cpf);
        System.out.println("Idade " + this.idade + " Telefone: " + this.telefone);
    }

}

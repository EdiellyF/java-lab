package entidades;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;


    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public Cliente cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do cliente:");
        String nome = sc.nextLine();
        System.out.print("Digite o cpf do cliente:");
        String cpf = sc.next();
        return new Cliente(nome, cpf);

    }

    @Override
    public String toString() {
        return "cliente:" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'';
    }
}

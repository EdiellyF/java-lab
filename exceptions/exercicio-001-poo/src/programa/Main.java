package programa;

import entidades.Cliente;
import entidades.Conta;
import exceptions.SaldoNegativoException;
import exceptions.SaqueNegativoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        List<Conta> contas = new ArrayList<>();

        System.out.println("Digite a quantidade de clientes que deseja cadastrar:");
        int n = sc.nextInt();


        for (int i = 0; i < n ; i++) {
            System.out.println("Dados #" + (i+1));
            clientes.add(new Cliente().cadastrar());
        }
        try {
                for (int i = 0; i < n ; i++) {
                    System.out.println("Dados de conta #" + (i+1));
                    System.out.println("Digite o saldo inicial");
                    double saldo = sc.nextDouble();
                    contas.add(new Conta(saldo, clientes.get(i)));

                  }


                for (int i = 0; i < n ; i++) {
                    System.out.print("Deseja sacar s(sim) || n(nao)?");
                    String opc = sc.next();
                    if (opc.equalsIgnoreCase("s"))
                         contas.get(i).sacar(sc.nextDouble());
                }



        }   catch (SaldoNegativoException  | SaqueNegativoException e){
            System.out.println(e.getMessage());
        }

        new Conta().listarContas(contas);
    }
}

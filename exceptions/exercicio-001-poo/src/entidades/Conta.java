package entidades;

import exceptions.SaldoNegativoException;

import java.util.List;

public class Conta {

    private double saldo;
    private Cliente cliente;

    public Conta(double saldo, Cliente cliente) {
        setSaldo(saldo);
        this.cliente = cliente;
    }

    public Conta() {
    }

    public void depositar(double valor){

    }


    public void sacar(double valor){
          if ((getSaldo() - valor) < 0){
              throw new SaldoNegativoException("PROIBIDO SACAR VALORES QUE DEIXEM A CONTA NEGATIVA");
          }
          setSaldo((getSaldo() - valor));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            throw  new SaldoNegativoException("Saldo negativo não permitido!!!");
        }
        this.saldo = saldo;
    }


    public void listarContas(List<Conta> contas){
        for (Conta c: contas){
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        return "conta:" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}

package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public void retirar(double monto){
        if(monto > saldo){
            System.out.println("Saldo Insuficiente");
        }
    }
}

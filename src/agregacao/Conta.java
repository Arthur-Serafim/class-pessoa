/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

/**
 *
 * @author alunolab07
 */
public class Conta {
    private double saldo;
    private int numero;
    
    private Cliente correntista;
    
    public boolean saca(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
    public void deposita(double valor){
        saldo = saldo + valor;
    }
    
    public void transfere(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }

    public Conta() {
    }

    public Conta(double saldo, int numero, Cliente correntista) {
        this.saldo = saldo;
        this.numero = numero;
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }
    
    
    
}

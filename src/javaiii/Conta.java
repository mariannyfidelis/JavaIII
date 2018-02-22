package javaiii;

public class Conta {


    private double saldo;
    private String titular;
    private int agencia;
    protected int numero;

    public double getSaldo(){
     return this.saldo;
    }

    public String getTitular(){
        return this.titular;    
    }

    public int getAgencia(){
        return this.agencia;
    }
    
    public int getNumero(){
     return this.numero;
    }
    
    public double sacar(double valor){
    
        if(this.saldo < valor){
            System.out.println("saldo insuficiente !");
            return 0;
        }else{
            System.out.println("saque realizado com sucesso !");
            this.saldo = this.saldo - valor;
            return valor;
        }
    }

    public void depositar(double valor){
    
        this.saldo+=valor;
    
    }
    
    @Override
    public String toString(){
        return "Conta:"+this.getNumero()+"\nTitular: "+this.getTitular()+ "\nSaldo: "+this.getSaldo();
    }
    
}

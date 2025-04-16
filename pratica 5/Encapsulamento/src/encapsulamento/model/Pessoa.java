package encapsulamento.model;

public class Pessoa {
    private double saldo;
    private String numeroConta;
    
    public Pessoa(String nc,double sl){
        this.numeroConta =nc;
        this.saldo = sl;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(String nc){  
            this.numeroConta =nc;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double sl){
        this.saldo =sl;
    }
    public void depositar(double valor){
        if(valor>0){
        saldo+=valor;}
        else{
            System.out.println("Nao e possivel adicionar valor negativo");
        }
    }
}

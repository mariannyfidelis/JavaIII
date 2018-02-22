
package javaiii;


public class ContaPoupança extends Conta implements Comparable<ContaPoupança>{

    @Override
    public int compareTo(ContaPoupança outra) {
        
        if(this.getNumero() < outra.getNumero()){
            return -1;
        }else if(this.getNumero() > outra.getNumero()){
            return 1;
        }
        else{
            return 0;
        
        }
    }  
}

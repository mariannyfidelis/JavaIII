package javaiii;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TestaOrdenação {
    
    
    public static void main(String args[]){
        
        ContaPoupança a = new ContaPoupança();
        ContaPoupança b = new ContaPoupança();
        ContaPoupança c = new ContaPoupança();
        ContaPoupança d = new ContaPoupança();
        
        a.numero = 100;
        b.numero = 400;
        c.numero = 200;
        d.numero = 10;
          
        List<ContaPoupança> lista = new LinkedList<>();
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        
        System.out.println("--------------------------------------------------");
        
        for(ContaPoupança cp : lista){
            System.out.println(cp);
        }
        
        System.out.println("--------------------------------------------------");
        
        Collections.sort(lista);
        
        for(ContaPoupança cp : lista){
            System.out.println(cp);
        }
        System.out.println("--------------------------------------------------");
        
        Collections.reverse(lista);
        
        for(ContaPoupança cp : lista){
            System.out.println(cp);
        }
        System.out.println("--------------------------------------------------");
    }
}

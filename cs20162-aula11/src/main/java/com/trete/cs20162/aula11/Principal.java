
package com.trete.cs20162.aula11;

import com.trete.cs20162.aula11.Calcular;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String expressao = ler.nextLine();
        
        try {
            System.out.println(Calcular.calcula(expressao));
            System.exit(0);
        } catch(Exception ex) {
            System.exit(1);
        }
    }
}

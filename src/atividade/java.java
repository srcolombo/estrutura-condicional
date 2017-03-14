
package atividade;

import static java.lang.System.out;
import java.util.Scanner;

public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Fazer um programa para calcular a média 
        de 3 notas, perguntar qual a nota mínima 
        para a aprovação e se tem direito a recuperação.
        Se tiver, pergunte a nota da recuperação e refazer a média.
        Mostrar média e situação do aluno no final.
        */
     
        Scanner entrada = new Scanner (System.in);
        System.out.println("Nota 1: ");
         float nota1= entrada.nextFloat();
         System.out.println("Nota 2: ");
          float nota2= entrada.nextFloat();
          System.out.println("Nota 3: ");
           float nota3= entrada.nextFloat();
            float media= nextFloat(); 
            float media=((nota1+nota2+nota3)/3);
            System.out.println("É necessario fazer recuperação?");
             
            
                  
           
          
                
        
    
           
         
          
        
        
      
    }

    private static float nextFloat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

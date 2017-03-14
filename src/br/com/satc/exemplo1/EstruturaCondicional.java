
package br.com.satc.exemplo1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class EstruturaCondicional {

       public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("Qual a sua idade? ");
            Scanner entrada= new Scanner(System.in);
             int idade = entrada.nextInt();
             if (idade<=13){
                 System.out.println("Criança.");   
             }
              if ((idade > 13) && (idade<18)) {
                  System.out.println("Adolescente.");
                  } 
                  else if ((idade>=18) &&(idade<=26) ){
                   System.out.println("Jovem 20Adulto.");  
               }    else if ((idade >26) && (idade<65) ) {
                    System.out.println("Adulto.!");
               } else {
                    System.out.println("Idoso.");
                    
                       
                 }
              }
           
    }
    


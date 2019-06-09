/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmate;

import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Mate {
    public double resultadovol ( double l ){
        double radio = l/ 2;
        double pi = Math.PI;
        double volumen = (4 * pi * (Math.pow(radio, 3)))/3;
        double volcubo = Math.pow(l, 3);
        double resta= volcubo- volumen;
        return resta;
    }
           
    public int calculadora (int numero1,String  operador,int numero2){
          int x = 0;
        if ("+".equals(operador)||"-".equals(operador)||"*".equals(operador)||"/".equals(operador)) {
             if("+".equals(operador)) {
                 x= numero1 + numero2;
                  System.out.println(numero1+numero2);
                  
            }
             if("-".equals(operador)){
                 x= numero1 - numero2;
                 System.out.println("numero1 - numero 2 ="+ x); 
                
            }    
             if ("/".equals(operador) ){
                 x= numero1/ numero2;
                System.out.println("numero1 / numero 2 ="+ x);
            }    
             if ("*".equals(operador)){
                 x= numero1 * numero2;
                 System.out.println("numero1 * numero2 ="+ x);}
        
        }  else{
            System.out.println("Solo se pueden estos operadores * / - +");     
        } 
        return x;
   
    
    }
     public int nurprimo (int contador, int primo1,int numero ){
        
        Scanner primo = new Scanner (System.in);
        System.out.println ("escriba un #");
        numero = primo.nextInt ();
    while (primo1 == 0 && contador != numero){
        
        if (numero % contador == 0)
        {
            primo1 = 1 ;
            contador ++ ;
            
        }        
                contador ++ ;

      
    }
        if (primo1 ==0)
        {
            System.out.println("es primo");
        }
        else 
        {
            System.out.println("no es primo, imtemtelo con otro #");
        }
                }
    
    }


         
                
    
    



        
    


      
       
       
        

        

        









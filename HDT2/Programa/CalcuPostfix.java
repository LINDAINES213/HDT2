/**
 * Esta clase tiene los metodos de la calculadora
 * @author: Linda Ines Jimenez Vides
 * @version: 19 - febrero - 2022
 */

import java.util.Stack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalcuPostfix implements InterfaceCalculadora{

    Stack<Integer> stack2 = new Stack<Integer>();
    File datos = new File("datos.txt");

    /**
     * Este metodo evalua las expresiones y realiza la operacion
     * @param String operacion
    */
    public int evaluarOperacion(String operacion){

        try {

            for(int i = 0; i < operacion.length(); i++){
            
                char S = operacion.charAt(i);

                if(S == ' '){

                    continue;

                } else if(Character.isDigit(S)){

                    int num = 0;

                    while(Character.isDigit(S)){
                        num = num * 10 + (int) (S - '0');
                        i++;
                        S = operacion.charAt(i);
                    }

                    i--;

                    stack2.push(num);

                } else{
                    
                    int num1 = stack2.pop();
                    int num2 = stack2.pop();

                    switch(S){

                        case '+':
                            stack2.push(num2+num1); 
                        break;

                        case '-':
                            stack2.push(num2-num1);
                        break;

                        case '/':
                            stack2.push(num2/num1);
                        break;

                        case '*':
                            stack2.push(num2*num1);
                        break;
                    }
                    
                }
            
            }

        } catch (Exception e) { 
            System.out.println("STACK VACIO");
            System.out.println(e.getMessage());      
        }
    return stack2.pop();    
    }

    
    /**
     * Este metodo lee el archivo txt con las operaciones
    */
    public void leerOperacion(){
        
        boolean contains = false;
        File datos = new File("datos.txt");
        BufferedReader operaciones = null;
        
        
        if(!datos.exists()){
            
            try {
                datos.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        try {

            FileReader leer = new FileReader("datos.txt");
            operaciones = new BufferedReader(leer);
            String texto = operaciones.readLine();

            while(texto != null){

                if(texto.contains("-") || texto.contains("+") || texto.contains("*") || texto.contains("/")){
                    System.out.println("\nExpresion: " + texto);
                    System.out.println("\nResultado: " + evaluarOperacion(texto));
                    texto = operaciones.readLine();
                    contains = true;

                } else if (!contains){
                    System.out.println("No se pudo leer la expresion");
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("\nARCHIVO NO ENCONTRADO\n");

        } catch (Exception e) { 
            System.out.println("\nERROR EN LA CARGA DE EXPRESIONES\n");
        }
        
        finally{
            
            try {

                if(operaciones != null){
                    operaciones.close();
                }

            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("ERROR DE CARGA DE EXPRESIONES");
                System.out.println(e.getMessage());
            }
        }
    }
}
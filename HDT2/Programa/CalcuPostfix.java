import java.util.Stack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class CalcuPostfix implements InterfaceCalculadora{

    Stack<Integer> stack2 = new Stack<Integer>();

    public int evaluarOperacion(String operacion){

        try {

            for(int i = 0; i < operacion.length(); i++){
            
                char c = operacion.charAt(i);

                if(c == ' '){

                    continue;

                } else if(Character.isDigit(c)){

                    int num = 0;

                    while(Character.isDigit(c)){
                        num = num * 10 + (int) (c - '0');
                        i++;
                        c = operacion.charAt(i);
                    }

                    i--;

                    stack2.push(num);

                } else{
                    
                    int num1 = stack2.pop();
                    int num2 = stack2.pop();

                    switch(c){

                        case '+':
                            stack2.push(num1+num2); 
                        break;

                        case '-':
                            stack2.push(num1-num2);
                        break;

                        case '/':
                            stack2.push(num2/num1);
                        break;

                        case '*':
                            stack2.push(num1*num2);
                        break;
                    }
                    
                }
            
            }

        } catch (Exception e) {       
            //String m = "Stack Vacio" + e.getMessage();
            throw new EmptyStackException();
        }
    return stack2.pop();    
    }

    
    
    public void leerOperacion(){
        
        String contenido = " ";
        File datos = new File("datos.txt");
        Scanner sc;
        boolean isEmpty = true;
        
        try {
            
            sc = new Scanner(new File("datos.txt"));
            FileReader leer = new FileReader("datos.txt");
            BufferedReader operaciones = new BufferedReader(leer);

            while(sc.hasNext()){
                contenido = sc.nextLine();
                
                if(!contenido.isEmpty()){
                    contenido = sc.nextLine();
                    evaluarOperacion(contenido);
                    System.out.println(evaluarOperacion(contenido));
                    contenido = sc.nextLine();
                    evaluarOperacion(contenido);
                    System.out.println(evaluarOperacion(contenido));
                    contenido = sc.nextLine();
                    evaluarOperacion(contenido);
                    System.out.println(evaluarOperacion(contenido));
                    contenido = sc.nextLine();
                    evaluarOperacion(contenido);
                    System.out.println(evaluarOperacion(contenido));
                    isEmpty = false;
                }
            }
            
        } catch (NoSuchElementException e) {
            System.out.println("\nBUSQUEDA FINALIZADA\n");

        } catch (Exception e) { 
            System.out.println("\nERROR EN LA CARGA DE OPERACIONES\n");
        }
    }
}
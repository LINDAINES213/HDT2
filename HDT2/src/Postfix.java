import java.util.Stack;

public class Postfix<S> implements InterfaceCalculadora<S>{

    public int Evaluar(String operacion){
        
        Stack<int> stack2 = new Stack<int>

        for(int i; i < operacion.length(); i++){
            
            char c = operacion.charAt(i);

            if(Character.isDigit(c)){
                stack2.push(c - "0")
            } else{
                int num1 = stack2.pop()
                int num2 = stack2.pop()

                if(c = "+"){
                    stack2.push(num1 + num2)
                } else (c = "-"){
                    stack2.push(num1-num2)
                } else(c = "/"){
                    stack2.push(num1/num2)
                } else(c = "*"){
                    stack2.push(num1*num2)
                }
            }
            return stack.pop()
        }
        
        //https://www.tutorialcup.com/es/interview/stack/evaluation-of-postfix-expression.htm

    }
}
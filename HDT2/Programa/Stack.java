/**
 * Esta clase tiene los metodos que se utilizan en un stack
 * @author: Linda Ines Jimenez Vides
 * @version: 19 - febrero - 2022
 */

import java.util.ArrayList;

public class Stack implements InterfaceStack{
    
    private ArrayList<String> stack =  new ArrayList<String>();

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        System.out.println("Stack vacio!");
        return size() == 0;
        
    }
    
    @Override
    public void peek() {
    	// TODO Auto-generated method stub
    	stack.get(0);
    }

    @Override
    public void push(String item) {
        // TODO Auto-generated method stub
        stack.add(item);
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return stack.size();
    }

    @Override
    public void pop() {
        // TODO Auto-generated method stub
        if(stack.isEmpty()){
            System.out.println("Stack vacio!");
            return;
        } else{
            stack.remove(stack.size() - 1);
        }
    }
}


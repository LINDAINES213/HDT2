import java.util.ArrayList;

public class Stack<S> implements InterfaceStack<S>{
    
    protected ArrayList<S> stack = stack = new ArrayList<S>();

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size() == 0;
    }

    @Override
    public void push(S item) {
        // TODO Auto-generated method stub
        stack.add(item);
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return stack.size();
    }

    @Override
    public S pop() {
        // TODO Auto-generated method stub
       return stack.remove(size()-1);
    }
}


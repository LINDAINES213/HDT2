import java.util.Vector;

public class VectorStack<S> implements InterfaceStack<S> {
    
    protected Vector<S> stack1 = new Vector<S>();
    private int num = 0;
    private boolean isempty;

    @Override
    public void push(S item){
        // TODO Auto-generated method stub
        stack1.addElement(item);
        num = num + 1;
    }

    @Override
    public S pop(){
        // TODO Auto-generated method stub
        if(num > 0){
            S last = stack1.lastElement();
            stack1.removeElement(num - 1);
            return last;
        }
        return null;
    }

    public void setisEmpty(boolean isempty){
        this.isempty = isempty;
    }

    @Override
    public boolean isEmpty(){
        // TODO Auto-generated method stub
        if(num == 0){
            setisEmpty(true);
        } else{
            setisEmpty(false);
        }
        return isempty;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return num;
    }

}

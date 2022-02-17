public interface InterfaceStack<S> {
    
    public void push(S item);
    public S pop();
    public boolean isEmpty();
    public int size();
}

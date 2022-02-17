public class Nodos<S> {
    
    private S val;
    Nodos<S> next;

    public Nodos(S val){
        this.val = val;
        next = null;
    }

    public S getVal(){
        return val;
    }

    public void setVal(S v){
        val = v;
    }

    public Nodos<S> getNext(){
        return next;
    }

    public void setNext(Nodos<S> next){
        this.next = next;
    }
}

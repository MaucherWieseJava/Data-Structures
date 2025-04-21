public class SimpleListNode {
    private Object element;

    private SimpleListNode next;

    public SimpleListNode(Object obj, SimpleListNode n){
        element = obj;
        next = n;

    }
    public Object getElement() {
        return element;

    }
    public void setElement(Object element) {
        this.element = element;

    }
    public SimpleListNode getNext() {
        return next;

    }
    public void setNext(SimpleListNode next){
        this.next = next;

    }

}

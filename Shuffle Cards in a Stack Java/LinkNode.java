//file name: LinkNode.java
//name:Walter DeVeas
//date:05/08/2023
//description: functions for parsing through and changing the nodes
public class LinkNode<E> {
    private E item;
    private LinkNode<E> next;

    public LinkNode(E item) {
        this.item = item;
        this.next = null;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public LinkNode<E> getNext() {
        return next;
    }

    public void setNext(LinkNode<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return item == null ? "null" : item.toString();
    }
}
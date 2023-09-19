//file name: LinkedStack.java
//name:Walter DeVeas
//date:05/08/2023
//description: defines the methods from the interface stack
public class LinkedStack<E> implements Stack<E> {
    private LinkNode<E> top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(E element) {
        LinkNode<E> newNode = new LinkNode<>(element);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        E element = top.getItem();
        top = top.getNext();
        size--;
        return element;
    }

    //@Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return top.getItem();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //@Override
    public int size() {
        return size;
    }

    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index1 == index2) {
            return;
        }
        LinkNode<E> node1 = top;
        for (int i = 0; i < index1; i++) {
            node1 = node1.getNext();
        }
        LinkNode<E> node2 = top;
        for (int i = 0; i < index2; i++) {
            node2 = node2.getNext();
        }
        E temp = node1.getItem();
        node1.setItem(node2.getItem());
        node2.setItem(temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        LinkNode<E> current = top;
        while (current != null) {
            sb.append(current.toString());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
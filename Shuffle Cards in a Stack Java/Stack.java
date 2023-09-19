//file name: Stack.java
//name:Walter DeVeas
//date:05/08/2023
//description: stack interface
public interface Stack<E> {
    public boolean isEmpty();

    public E peek();

    public E pop();

    public void push(E target);
}
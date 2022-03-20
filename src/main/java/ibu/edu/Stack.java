package ibu.edu;

public class Stack<Item> {
    private Node<Item> top = null;
    private int size = 0;


    public void push(Item item){
        Node<Item> newNode = new Node<Item>();
        newNode.data = item;
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Item pop(){
        if (top == null) {
            throw new IndexOutOfBoundsException("Stack is empty!");
        }
        Item data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}

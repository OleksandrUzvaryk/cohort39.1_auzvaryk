package example;

public class SingleLinkedList<T> {

    private Node<T> first;
    private int count;

    public SingleLinkedList() {
        first = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value, first);
        first = newNode;
        count++;
    }

    public int size() {
        return count;
    }

    public void add(T value) {
        if (isEmpty()) {
            first = new Node<>(value, null);
            count++;// count = 1;
            return;
        }

        Node<T> current = first;

        while (current.hasNext()) {
            current = current.getNext();
        }

        Node<T> newNode = new Node<>(value, null);
        current.setNext(newNode);
        count++;

    }

    public void add(T value, int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index out of bound exeption" + count);

        } else if (index == 0) {
            addFirst(value);
            return;
        } else if (index == count) {
            add(value);
            return;
        }

    }
    public  int indexOf(T value){
        if (isEmpty()){
            return -1;
        }
        Node<T> current = first;
        while (current != null){
            current = current.getNext();
        }
        for (int i = 0; current != null; i++) {
            if (current.getValue().equals(value)){
                return i;
            }
        }current = current.getNext(); return -1;
    }
    public boolean contains(T value){
        return indexOf(value) !=1;
    }

   /* public boolean remove (T value){
        int index = indexOf(value);
        if (index ==-1){
            return false;
        }else return remove(index);
    }*/






    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

}
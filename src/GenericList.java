package src;

public class GenericList<T> {
    private GenericNode<T> first = null;

    public int size() {
        if (this.first == null) {
            return 0;
        }
        int count = 1;
        GenericNode<T> iterator = first;
        while (iterator.getNext() != null) {
            count++;
            iterator = iterator.getNext();
        }
        return count;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        GenericNode<T> iterator = this.first;
        for (int i = 0; i < index; i++) {
            iterator = iterator.getNext();
        }
        return iterator.getValue();
    }

    public boolean isEmpty() {
        return this.size() > 0 ? false : true;
    }

    public void insertFront(T value) {
        GenericNode<T> newNode = new GenericNode<T>(value);
        if (this.first == null)
            this.first = newNode;
        else {
            newNode.setNext(this.first);
            this.first = newNode;
        }
    }

    public void insertEnd(T value) {
        GenericNode<T> newNode = new GenericNode<T>(value);
        if (this.first == null)
            this.first = newNode;
        else {
            GenericNode<T> iterator = this.first;
            while (iterator.getNext() != null) {
                iterator = iterator.getNext();
            }
            iterator.setNext(newNode);
        }
    }

    public void insertAt(int index, T value) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        if (index == 0) {
            this.insertFront(value);
        } else if (index == this.size()) {
            this.insertEnd(value);
        } else {
            GenericNode<T> newNode = new GenericNode<T>(value);
            GenericNode<T> iterator = this.first;
            for (int i = 0; i < index - 1; i++) {
                iterator = iterator.getNext();
            }
            newNode.setNext(iterator.getNext());
            iterator.setNext(newNode);
        }
    }

    public T remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        T value;
        if (index == 0) {
            value = this.first.getValue();
            this.first = this.first.getNext();
        } else {
            GenericNode<T> iterator = this.first;
            for (int i = 0; i < index - 1; i++) {
                iterator = iterator.getNext();
            }
            value = iterator.getNext().getValue();
            iterator.setNext(iterator.getNext().getNext());
        }
        return value;
    }

    public void deleteFront() {
        if (this.first != null) {
            this.first = this.first.getNext();
        }
    }

    public GenericNode<T> getFirst() {
        return this.first;
    }

    public GenericNode<T> getLast() {
        GenericNode<T> iterator = this.first;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        return iterator;
    }

    public T[] listAll() {
        T[] list = (T[]) new Object[this.size()];
        GenericNode<T> iterator = this.first;

        if (iterator == null)
            return list;

        int count = 0;
        while (iterator != null) {
            list[count] = iterator.getValue();
            count++;
            iterator = iterator.getNext();
        }
        return list;
    }
}

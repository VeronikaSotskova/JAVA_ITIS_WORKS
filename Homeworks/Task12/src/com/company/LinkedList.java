package com.company;

/**
 * Created by Notebook on 21.03.2017.
 */
public class LinkedList {
    private Node first;
    private Node last;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.first = null;
        this.last = null;
    }

    public void addToEnd(int value) {
        // создаем новый узел
        Node newNode = new Node(value);
        // если в списке нет элементов
        if (count == 0) {
            // то новый узел и есть первый
            this.first = newNode;
            this.last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        // увеличиваем количество
        count++;
    }

    public void showAllNodes() {
        Node current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

   public void remove(int value) {
        Node current = this.first;
        while (current.getNext().getValue() != value) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }

   public int getByIndex(int index) {
       int value = 0;
       Node current = this.first;
       if (index < count) {
            for (int i = 0; i < index-1; i++) {
                current = current.getNext();
            }
            value = current.getValue();
        }
        return value;
    }
}

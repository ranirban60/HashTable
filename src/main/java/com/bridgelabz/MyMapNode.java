package com.bridgelabz;

public class MyMapNode <K,V> {
    K key;
    V value;
    MyMapNode<K, V> next;

    //Create MyMapNode constructor and passing key and value
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }
    // method getter and setter
    //getKey() method is used to fetch the key
    public K getKey() {
        return key;
    }
    //setKey() method is used to set the key
    public void setKey(K key) {
        this.key = key;

    }
    //getValue() method is used to fetch the value
    public V getValue() {
        return value;
    }
    //setValue() method is used to set the value
    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(MyMapNode<K, V> next) {
        this.next = (MyMapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode{" + " Key = ").append(key).append(" Value = ").append(value).append('}');
        if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}


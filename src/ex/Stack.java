/*
 * Copyright (c) 2020.
 * User: vuhe
 * File: ex.Stack.java
 * Date: 2020/06/20 13:08:20
 */
package ex;

import java.util.LinkedList;

/**
 * ex.Stack
 *
 * @author zhuhe
 */
public class Stack<T> {

    private final LinkedList<T> stack = new LinkedList<>();

    public Stack() {
    }

    public T push(T item) {
        stack.push(item);
        return item;
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int search(T o) {
        return stack.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}

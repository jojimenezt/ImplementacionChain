/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack2;

/**
 *
 * @author Estudiante
 */
public interface Stack<T> {
    boolean isEmpty();
    T peek();
    void push(T object);
    T pop();
}

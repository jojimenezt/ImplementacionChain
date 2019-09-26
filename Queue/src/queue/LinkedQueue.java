/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Estudiante
 */
public class LinkedQueue<T> implements Queue<T> {
    protected ChainNode<T> front;
    protected ChainNode<T> rear;
}

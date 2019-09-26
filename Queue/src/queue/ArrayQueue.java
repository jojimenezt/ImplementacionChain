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
public class ArrayQueue<T> implements Queue<T> {
    int front;
    int rear;
    T[] queue;
    
    public ArrayQueue(int inicialCapacity){
        if(inicialCapacity<1)
            throw new IllegalArgumentException("inicialCampacity must be > 1");
        front = rear= 0;
    }
    
    public ArrayQueue(){
        this(10);
    }
    
    public boolean isEmpty(){
        return front==rear;
    }
    
    public T getFrontElement(){
        if(isEmpty()) return null;
        else return queue[(front + 1)% queue.length];
    }
}

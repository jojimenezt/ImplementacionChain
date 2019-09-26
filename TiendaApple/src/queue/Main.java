package queue;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        
        Queue productos = new ArrayQueue<String>();
        
        
        Scanner x= new Scanner(System.in);
        int numProductos = x.nextInt();
        for(int i=0;i<numProductos;i++){
            productos.put(x.next());
        }
        int nn = 0;
        int numTiendas= x.nextInt();
        ArrayQueue tiendas = new ArrayQueue<ArrayStack>();
        for(int i=0;i<numTiendas;i++){
            nn = x.nextInt();
            ArrayStack arr = new ArrayStack(nn);
            for(int j=0; j<nn; j++) arr.push(productos.remove());
            tiendas.put(arr);
        }
        
        for(int i=0;i<numTiendas;i++){
            ArrayStack ti = (ArrayStack) tiendas.remove();
            ti = ti.invert();
            System.out.print("[");
            while(! ti.isEmpty()) System.out.print(ti.pop()+" ");
            System.out.println("]");
        }
        
    }
    
    
    
}

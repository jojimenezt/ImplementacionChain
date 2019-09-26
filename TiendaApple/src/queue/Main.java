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
        Scanner x= new Scanner(System.in);
        int numProductos = x.nextInt();
        String[] productos= new String[numProductos];
        for(int i=0;i<numProductos;i++){
            productos[i]=x.next();
        }
        
        int numTiendas= x.nextInt();
        int[] tiendas= new int[numTiendas];
        for(int j=0;j<numTiendas;j++){
            tiendas[j]=x.nextInt();
        }
        
  
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gt.edu.url.examen2.problema2.*;
//import gt.edu.url.examen2.problema3.*;
import gt.edu.url.examen2.problema4.*;
import gt.edu.url.examen2.problema5.*;

/**
 *
 * @author Laptop
 */
public class examen2 {

    public static void main(String[] args) {
        //Problema2_____________________________________________________________
        /*
        DemostracionLista DL = new DemostracionLista();
        DL.crearDemoLista();

        for (int i = 0; i < 8; i++) {
            System.out.println(DL.L.get(i));
        }
        */
        //Problema3_____________________________________________________________
        /*
        PositionalList<Integer> myPL = new PL<>();
        Position<Integer> p, a, b;
        p = myPL.addFirst(1);
        p = myPL.addAfter(p, 2);
        p = myPL.addAfter(p, 3);
        p = myPL.addAfter(p, 4);
        p = myPL.addAfter(p, 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(myPL.after(p));
        }
        
        System.out.println("");
        
        p = myPL.addFirst(1);
        a = myPL.addAfter(p, 2);
        p = myPL.addAfter(a, 3);
        b = myPL.addAfter(p, 4);
        p = myPL.addAfter(b, 5);
        // myPL.swap(a, b);

        for (int i = 0; i < 5; i++) {
            System.out.println(myPL.remove(myPL.first()));
        }
        */
        //Problema4_____________________________________________________________
        /*
        PositionalList<Integer> myPL4 = new PL<>();
        Position<Integer> p4, a4, b4;
        p4 = myPL4.addFirst(1);
        p4 = myPL4.addAfter(p4, 2);
        p4 = myPL4.addAfter(p4, 3);
        p4 = myPL4.addAfter(p4, 4);
        p4 = myPL4.addAfter(p4, 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(myPL4.remove(myPL4.first()));
        }
        
        p4 = myPL4.addFirst(1);
        p4 = myPL4.addAfter(p4, 2);
        p4 = myPL4.addAfter(p4, 3);
        p4 = myPL4.addAfter(p4, 4);
        p4 = myPL4.addAfter(p4, 5);
        
        System.out.println("");
        System.out.println(myPL4.positionAtIndex(2).getElement());
        System.out.println(myPL4.positionAtIndex(3).getElement());
        System.out.println(myPL4.positionAtIndex(7).getElement());
        */
        //Problema5_____________________________________________________________
        /*
        Stack <Integer> myS = new DynamicStack<>();
        
        myS.push(1);
        myS.push(2);
        myS.push(3);
        myS.push(4);
        myS.push(5);
        myS.push(6);
        myS.push(7);
        myS.push(8);
        myS.push(9);
        myS.push(10);
        myS.push(11);
        myS.push(12);
        
        
        for (int i = 0; i < 15; i++) {
            System.out.println(myS.pop());
        }
        */        
    }
}

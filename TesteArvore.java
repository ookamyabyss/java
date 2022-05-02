/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvore;

/**
 *
 * @author lamii07-linux
 */
public class TesteArvore {
    
    
    public static void main(String[] args) {
        
        Tree t = new Tree();
        
        No raiz = new No("A");
        t.setRoot(raiz);
        
        No b = new No("B");
        No c = new No("C");
        No d = new No("D");
        No e = new No("E");
        No f = new No("F");
        No g = new No("G");
        No h = new No("H");
        No i = new No("I");
        
        raiz.setEsq(b);
        raiz.setDir(c);
        
        b.setEsq(d);
        b.setDir(e);
        
        c.setEsq(f);
        c.setDir(g);
        
        d.setEsq(h);
        
        f.setEsq(i);
        
        System.out.println("\n Pre Ordem");
        t.preOrder(t.getRoot());
        
        System.out.println("\n Em Ordem");
        t.inOrder(t.getRoot());
        
        System.out.println("\n Pos Ordem");
        t.posOrder(t.getRoot());
        
        
    }
    
}

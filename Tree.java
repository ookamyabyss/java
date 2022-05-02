/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvore;

/**
 *
 * @author lamii07-linux
 */
public class Tree {
    private No root;
    
    public Tree(){
        this.root = null;
    }

    /**
     * @return the root
     */
    public No getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(No root) {
        this.root = root;
    }
    
    public void inOrder(No atual){
        if(atual != null) {
            inOrder(atual.getEsq());
            System.out.print(atual.getNome() + " ");
            inOrder(atual.getDir());
        }
                
    }
    
    public void preOrder(No atual){
        if(atual != null) {
            System.out.print(atual.getNome() + " ");
            preOrder(atual.getEsq());
            preOrder(atual.getDir());
        }
                
    }
    
    public void posOrder(No atual){
        if(atual != null) {
            posOrder(atual.getEsq());
            posOrder(atual.getDir());
            System.out.print(atual.getNome() + " ");
            
        }
                
    }
    
}

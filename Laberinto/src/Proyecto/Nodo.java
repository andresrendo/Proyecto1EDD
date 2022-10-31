/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author AndresRendo
 */
public class Nodo {
    Nodo left;
    Nodo right;
    String data;
    
    public Nodo(String data){
        this.data = data;
                }
    public Nodo(String data, Nodo left, Nodo right){
            this.data = data;
            this.left = left;
            this.right = right;
    }
}

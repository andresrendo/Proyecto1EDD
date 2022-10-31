/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author AndresRendo
 */
public class DFS {
    public void traversal(Nodo nodo){
        if (nodo == null)
            return;
        System.out.println(nodo.data);
        System.out.println(nodo.left);
        System.out.println(nodo.right);
    }
    
}

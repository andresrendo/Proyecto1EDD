/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author AndresRendo
 */
public class Cola<T> {

    private class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        public Nodo<T> siguiente(){
            return siguiente;
        }

        public T dato(){
            return dato;
        }
        public void setSiguiente(Nodo<T> n){
            siguiente = n;
        }
    }
    private Nodo<T> ultimo;
    private Nodo<T> primero;
    private int tamaño;

    public Cola() {
        ultimo = null;
        primero = null;
        tamaño = 0;
    }

    public T encolar(T dato){
        Nodo<T> tmp = new Nodo<>(dato);
        if(ultimo == null && primero == null)
            ultimo = primero = tmp;
        else
            ultimo.setSiguiente(tmp);
        ultimo = tmp;
        tamaño++;
        return dato;
    }

    public T desencolar(){
        if(primero == null)
            return null;
        Nodo<T> tmp = primero;
        primero = primero.siguiente();
        if (primero == null)
            ultimo = null;
        tamaño--;
        return tmp.dato();
    }

    public int tamaño(){
        return tamaño;
    }


    public boolean vacio(){
        return primero == null;
    }


    public T primero(){
        return primero.dato();
    }


}

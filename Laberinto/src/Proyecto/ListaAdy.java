package Proyecto;

public class ListaAdy <T>{
  Vertices primero;
  Vertices ultimo;
  int tamaño;
  public ListaAdy (){
    primero = ultimo = null;
    tamaño = 0;
  }
  public Vertices getPrimero() {
        return primero;
    }
    public void setPrimero(Vertices p) {
        this.primero = p;
    }
  
  public boolean estaVacia(){
    return primero == null;
  }
  
  public void insertar( int dato, int peso){
    Vertices temp = new Vertices(dato);
    temp.setPeso(peso);
    if (primero == null){
      primero = ultimo = temp;
      }
    else{
      ultimo.setvSiguiente(temp);
      ultimo = temp;
    }
    tamaño++;
  }
  
  public boolean contains(Vertices v){
    Vertices aux = primero;
    while (aux != null){
      if (aux.getIndice() == v.getIndice()){
        return true;
      }
      aux = aux.getvSiguiente();
    }
    return false;
  }
  
  public void eliminar(int dato){
  Vertices i = primero;
  while(i != null) {
      if  (i.getIndice() == dato){
        if (i.getvAnterior() != null && i.getvSiguiente() != null){
          Vertices temp = i.getvAnterior();
          temp.setvSiguiente(i.getvSiguiente());
          i.getvSiguiente().setvAnterior(temp);
          
          }
        else if (i.getvAnterior() == null && i.getvSiguiente() != null){
          i.getvSiguiente().setvAnterior(null);
          primero = i.getvSiguiente();
          }
        else if (i.getvAnterior() != null && i.getvSiguiente() == null){
          i.getvAnterior().setvSiguiente(null);
          ultimo = i.getvAnterior();
          }
        i.getvSiguiente();
      }
  }
  tamaño--;
  }
  
  public int getTamaño(){
      return tamaño;
  }
  
  public void setTamaño(int n){
      tamaño = n;
  }




}


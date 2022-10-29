public class ListaAdy <T>{
  Vertice primero;
  Vertice ultimo;
  public ListaAdy (){
    primero = ultimo = null;
  }
  public Vertice getPrimero() {
        return primero;
    }
    public void setPrimero(Vertice p) {
        this.primero = p;
    }
  
  public boolean estaVacia(){
    return primero == null;
  }
  
  public insertar(T dato){
    Vertice temp = Vertice(dato);
    if (primero == null){
      primero = ultimo = temp;
      }
    else{
      ultimo.setvSiguiente(temp);
      ultimo = temp;
    }
  }
  
  public eliminar(T dato){
  for(i = primero; i != null, i = primero.getvSiguiente()) {
      if  (i.getIndice == dato){
        if (i.getvAnterior != null && i.getvSiguiente() != null){
          temp = i.getvAnterior();
          temp.setSiguiente(i.getvSiguiente());
          i.getvSiguiente().setvAnterior(temp);
          
          }
        else if (i.getvAnterior == null && i.getvSiguiente() != null){
          i.getvSiguiente().setvAnterior(null);
          primero = i.getvSiguiente();
          }
        else if (i.getvAnterior != null && i.getvSiguiente() == null){
          i.getvAnterior().setvSiguiente(null);
          ultimo = i.getvAnterior();
          }
      }
  }
  }



}

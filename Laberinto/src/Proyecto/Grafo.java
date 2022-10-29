public class Grafo{
  int numvert;
  int vertmax;
  Vertice[] ady;
  
  public Grafo(int max){
    numvert = 0;
    vertmax = max;
    ady = new Vertice[max];
  
  }
  
  public ListaAdy verAdyacentes(int ind){
    return ady[ind].getAdy();
  }
  
 
  public boolean verificarAdyacencia (Vertice v1, Vertice v2){
    ListaAdy temp = v1.getAdy();
    return temp.contains(v2);
  }






}

public class Vertice {
    int indice;
    ListaAdy <Object> vAdy;
    
    public Vertice(){
        this.indice = -1;
        this.vAdy = new ListaAdy();
    }
    public int getIndice() {
        return indice;
    }

    public void setIndice(int ind) {
        this.indice = ind;
    }

  
    public ListAdy getvAdy() {
        return vAdy;
    }
}

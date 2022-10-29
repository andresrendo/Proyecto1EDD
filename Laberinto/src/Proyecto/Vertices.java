public class Vertice {
    int indice;
    Vertice vSiguiente;
    Vertice vAnterior;
    boolean pared = false;
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
    
    public Vertice getvSiguiente() {
        return vSiguiente;
    }

    public void setvSiguiente(Vertice ind) {
        this.vSiguiente = ind;
    }
    public Vertice getvAnterior() {
        return vAnterior;
    }

    public void setvAnterior(Vertice ind) {
        this.vAnterior = ind;
    }
    
    public boolean getPared() {
        return pared;
    }

    public void setPared(boolean ind) {
        this.pared = ind;
}

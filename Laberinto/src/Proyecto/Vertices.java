public class Vertices {
   
    int indice;
    Vertices vSiguiente;
    Vertices vAnterior;
    int peso;
    ListaAdy <Object> vAdy;
    
    public Vertices(int indice){
        this.indice = indice;
        this.vAdy = new ListaAdy();
        this.vAnterior = this.vSiguiente = null;
        this.peso = 0;
    }
    public int getIndice() {
        return indice;
    }

    public void setIndice(int ind) {
        this.indice = ind;
    }

    public ListaAdy getvAdy() {
        return vAdy;
    }
    
    public Vertices getvSiguiente() {
        return vSiguiente;
    }

    public void setvSiguiente(Vertices ind) {
        this.vSiguiente = ind;
    }
    public Vertices getvAnterior() {
        return vAnterior;
    }

    public void setvAnterior(Vertices ind) {
        this.vAnterior = ind;
    }
    public int getPeso() {
        return peso;
    }

    public void setPeso(int ind) {
        this.peso = ind;
    }
}


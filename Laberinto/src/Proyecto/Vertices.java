public class Vertice {
    int numero;
    Vertice siguiente;
    
    public Vertice(int n, Vertice sig){
        this.numero = n;
        this.siguiente = sig;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  
    public Vertice getSigiente() {
        return sigiente;
    }

    public void setSigiente(Vertice sigiente) {
        this.sigiente = sigiente;
    }
}

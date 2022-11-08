public class Grafo {
    private int vertices;
    private static int maxVertices;
    private Vertices [] ady;
    
    public Grafo(int max){
        ady = new Vertices[max];
        vertices = 0;
        maxVertices = max;
    }
    
    public ListaAdy verticesAdy(int ind){
        return ady[ind].getvAdy();
    }
    
    public Vertices buscarVertice(int ind){
        Vertices aux = new Vertices(ind);
        for (int i = 0; i < vertices; i++) {
            if (ady[i].getIndice()== ind){
                return ady[i];
            }
        }
        return null;
    }
    
    public void nuevoVertice(int indice){
        Vertices aux = new Vertices(indice);
        boolean existe = false;
        
        
        for (int i = 0; i < vertices; i++) {
            if (ady[i].getIndice() == indice){
                existe = true;
                break;
            }
            
        }
        if (!existe){
            ady[vertices]= aux;
            vertices++;
        }
    }
    
    public boolean sonAdy(Vertices a, Vertices b){
        return ady[a.getIndice()].getvAdy().contains(b);
    }
    
    public void crearAdy(int x, int y){
        Vertices a = buscarVertice(x);
        Vertices b = buscarVertice(y);
        if (!sonAdy(a,b)){
            Random rnd = new Random();
            int peso = rnd.nextInt(100);
            ady[a.getIndice()].vAdy.insertar(b.getIndice(), peso);
        }
    }
    
    public void eliminarAdy(Vertices a, Vertices b){
        if (sonAdy(a,b)){
            ady[a.getIndice()].vAdy.eliminar(b.getIndice());
        }
    }
    
    public void prim(){
        Random rnd = new Random();
        int inicio = rnd.nextInt(0, vertices-1);
        Vertices[] visitados = new Vertices[vertices-1];
        visitados[0] = ady[inicio];
        int cont = 1;
        ListaAdy aux = new ListaAdy();
        while(cont< ady.length+1){
            int min = 0;
            Vertices vert =  null;
            int indice = 0;
            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < visitados[i].getvAdy().getTamaño(); j++) {
                    Vertices vAux = visitados[i].getvAdy().getPrimero();
                    while(vAux != null){
                        if(vAux.getPeso()> min && !aux.contains(vAux)){
                            min = vAux.getPeso();
                            vert = vAux;
                            indice = i;
                    }
                    vAux = vAux.getvSiguiente();
                    }
                    
                }
                
            }
            
            visitados[cont]= vert;
            aux.insertar(vert.getIndice(), min);
            visitados[indice].getvAdy().eliminar(vert.getIndice());
            cont++;
            
            
        }
        System.out.println(visitados.length);
        for (int i = 0; i < visitados.length; i++) {
            System.out.println(visitados[i].getIndice());
        }
    }

    /**
     * @return the vertices
     */
    public int getVertices() {
        return vertices;
    }

    /**
     * @param vertices the vertices to set
     */
    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    /**
     * @return the maxVertices
     */
    public static int getMaxVertices() {
        return maxVertices;
    }

    /**
     * @param aMaxVertices the maxVertices to set
     */
    public static void setMaxVertices(int aMaxVertices) {
        maxVertices = aMaxVertices;
    }

    /**
     * @return the ady
     */
    public Vertices[] getAdy() {
        return ady;
    }

    /**
     * @param ady the ady to set
     */
    public void setAdy(Vertices[] ady) {
        this.ady = ady;
    }
    
    
}

public class BitMap {

    //Clase nodo
    public class Nodo{
        int info;
        Nodo next;
    }

    //Atributos de la lista
    Nodo raiz;
    int size;

    //Constructor
    public BitMap(){

        raiz=null;
        int size=0;
    }

    public void On(int i){
        Nodo aux = this.raiz;


        for(int j = 0; j < i - 1; ++j) {
            aux = aux.next;
        }

    }









}






















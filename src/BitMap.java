public class BitMap {



    //Atributos de la lista
    private byte list[];
    private int size;
    //Constructor
    public BitMap(int size) {

        list=new byte[size];
        this.size=size;
    }

    //Metodos
    public void On(int i){
        list[i]=1;
    }

    public void Off(int i){
        list[i]=0;
    }

    public byte Access(int i){
        return list[i];

    }

    public int Rank(int i){
        int cont=0;

        for (int j=0; j< i;j++){
            if(list[j]==1) {
                cont++;
            }
        }
        return cont;
    }

    public int Select(int j) {

        int pos = 0;
        int cont = 0;

        for (int i = 0; i < size; i++) {
            if (cont < j) {
                if (list[i] == 1) {
                    cont++;
                    pos = i;
                }
            }
        }
        if (cont == j) {
            return pos;
        }
        return -1;

    }



}



























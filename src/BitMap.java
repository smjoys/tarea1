public class BitMap {



    //Atributos de la lista
    private byte b[];

    //Constructor
    public BitMap(int size) {

        b=new byte[size];

    }

    //Metodos
    public void On(int i){
       b[i]=1;
    }

    public void Off(int i){
        b[i]=0;
    }

    public byte Access(int i){
        return b[i];

    }

    public int Rank(int i){
        int cont=0;

        for (int j=0; j< i;j++){
            if(b[j]==1) {
                cont++;
            }
        }
        return cont;
    }

    public int Select(int j) {

        int pos = 0;
        int cont = 0;

        for (int i = 0; i < b.length; i++) {
            if (cont < j) {
                if (b[i] == 1) {
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












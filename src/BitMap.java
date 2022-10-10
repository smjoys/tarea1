public class BitMap {


    private int tope;
    private byte p[];


    //Constructor
    BitMap(int size){
        tope=-1;
        p=new byte[size];

    }

    public void on(int i){
        p[i]=1;
    }

    public void off(int i){
        p[i]=0;
    }

    public byte access(int i){
        return p[i];
    }

    public int Rank(int i){
        int cont=0;
        for (int j=0;j>p.length;j++){
            if (p[j] == 1) {
                cont++;
            }
        }
        return cont;
    }

    public int Select(int j) {
        int cont=0;
        int i=0;
        while(cont==j){
            if(p[i]==1){
                cont++;
            }
            i++;


        }
        if(cont<j){
            return -1;
        }else{
            return i;
        }
    }


}

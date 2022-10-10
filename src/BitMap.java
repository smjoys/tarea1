public class BitMap {


    private int tope;
    private Byte p[];



    //Constructor
    BitMap(int size){
        tope=-1;
        p=new Byte[size];

    }

    public void on(int i){
        p[i]=1;
    }

    public void off(int i){
        p[i]=0;
    }

    public Byte access(int i){
        return p[i];
    }



}

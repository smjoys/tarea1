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



}

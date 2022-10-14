public class DinArray {


    //Atributos
    private int b[];

    private int size;

    //Constructor
    DinArray(int size){

        int ni = (int) Math.ceil(size/32);
        b=new int [ni];
        this.size=size;
    }

    public boolean Insertar(int x){

        for (int i = 0; i <size ; i++) {
            if(b[i]==0){
                b[i]=x;
            }
            return true;
        }
        return false;
    }


    public void Eliminar(int x){
        for (int i = 0; i <size ; i++) {
            if(b[i]==x){
                b[i]=0;
            }
        }

    }

    public int Size(){
        int cont=0;
        for (int i = 0; i <size ; i++) {
            if(b[i]!=0){
            cont++;
            }
        }
        return cont;
    }


    public int Esta(int x){
        int pos=0;
        for (int i = 0; i <size ; i++) {
            if(b[i]==x){
                pos=i;
            }
            return pos;
        }
        return -1;
    }



}

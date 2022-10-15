public class DinArray {


    //Atributos
    private int s[];



    //Constructor
    DinArray(int x){

        s=new int [x];

    }

    public boolean Insertar(int x){

        for (int i = 0; i <s.length; i++) {
            if(s[i]==0){
                s[i]=x;
            }
            return true;
        }
        return false;
    }


    public void Eliminar(int x){
        for (int i = 0; i <s.length ; i++) {
            if(s[i]==x){
                s[i]=0;
            }
        }

    }

    public int Size(){
        int cont=0;
        for (int i = 0; i <s.length ; i++) {
            if(s[i]!=0){
                cont++;
            }
        }
        return cont;
    }


    public int Esta(int x){
        int pos=0;
        for (int i = 0; i <s.length ; i++) {
            if(s[i]==x){
                pos=i;
            }
            return pos;
        }
        return -1;
    }

    public int Mostrar(int i){
        return s[i];
    }



}

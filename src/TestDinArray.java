public class TestDinArray {

    public static void main(String[] args) {


        DinArray s= new DinArray(9);

        BitMap b=new BitMap(288);





        s.Insertar(64);



        System.out.print("las posiciones: ");
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + i+ "]");
        }
        System.out.println();
        System.out.print("los arreglos:  ");
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + s.Mostrar(i)+ "]");
        }
        System.out.println();
        System.out.print("los bits:       ");
        for (int j =0;j<9;j++){
            System.out.print("[" + b.Access(j) + "]");
        }

        System.out.println();
        System.out.println("En que posicion esta el 64:" + s.Esta(64));
        System.out.println();
        System.out.println("Elemento de el DinArray" +s.Size());
        System.out.println();
        System.out.println("Eliminando 64");
        s.Eliminar(64);

        System.out.println();
        System.out.println();
        System.out.print("las posiciones: ");
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + i+ "]");
        }
        System.out.println();
        System.out.print("los arreglos:  ");
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + s.Mostrar(i)+ "]");
        }
        System.out.println();
        System.out.print("los bits:       ");
        for (int j =0;j<9;j++){
            System.out.print("[" + b.Access(j) + "]");
        }
    }


}

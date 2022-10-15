public class TestDinArray {

    public static void main(String[] args) {


        DinArray s= new DinArray(9);

        BitMap b=new BitMap(288);


        int c;
        b.On(4);
        if (b.Select(1)>1) {
            c=b.Select(1);
            s.Insertar(23,c);
            b.Off(c);
        }


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
        System.out.println("En que posicion esta el 23:" + s.Esta(23));
        System.out.println();
        System.out.println("Elementos de el DinArray: " +s.Size());
        System.out.println();
        System.out.println("Eliminando 23");
        s.Eliminar(23);

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

public class TestDinArray {

    public static void main(String[] args) {


        DinArray s= new DinArray(9);

        BitMap b=new BitMap(288);

        int c,x;



        b.On(3);
        s.Insertar(64);
        s.Insertar(-3);
        b.Off(4);

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

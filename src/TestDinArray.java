public class TestDinArray {

    public static void main(String[] args) {


        DinArray s= new DinArray(9);

        BitMap b=new BitMap(288);

        int c,x;

        b.On(8);

        c = b.Access(1);
        s.Insertar(c);
        b.Off(c);

        for (int i = 0; i < 9; i++) {
            System.out.print("[" + s.Mostrar(i)+ "]");
        }
        System.out.println();
        for (int j =0;j<9;j++){
            System.out.print("[" + b.Access(j) + "]");
        }



    }


}

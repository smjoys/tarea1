public class TestDinArray {

    public static void main(String[] args) {


        DinArray s= new DinArray(9);

        BitMap b=new BitMap(288);

        int c,x;


        c = b.Access(0);
        b.On(c);
        s.Insertar(c);
        b.Off(c);


        for (int i = 0; i < 9; i++) {
            System.out.print("[" + i+ "]");
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + s.Mostrar(i)+ "]");
        }
        System.out.println();
        for (int j =0;j<9;j++){
            System.out.print("[" + b.Access(j) + "]");
        }



    }


}

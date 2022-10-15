public class TestDinArray {

    public static void main(String[] args) {


        DinArray s= new DinArray(9);

        BitMap b=new BitMap(9);

        int c,x;
        b.On(1);
        b.On(2);
        c = b.Access(1);
        s.Insertar(c);
        b.Off(c);

        for (int i = 0; i < 9; i++) {
            System.out.print("[" + b.Select(i) + "]");
        }

    }


}

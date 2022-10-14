public class TestBitMap {
    public static void main(String[] args) {

        BitMap l = new BitMap(9);



        System.out.println("Encendiendo todos los bits");
        for (int i = 0; i < 9; i++) {
            l.On(i);
        }

        for (int i = 0; i < 9; i++) {
            System.out.print("[" + l.Access(i) + "]");
        }
        System.out.println();
        System.out.println();

        System.out.println("Apagando los bit en las posiciones 0,1,2,3,4");
        for (int i = 0; i < 5; i++) {
            l.Off(i);
        }


        for (int i = 0; i < 9; i++) {
            System.out.print("[" + l.Access(i) + "]");
        }

        System.out.println();
        System.out.println();

        System.out.println("Bits encendios hasta la posicion 6: " + l.Rank(6));


        System.out.println("Ultima posicion del segundo bit encendido: " + l.Select(4));



    }
}

public class main {
    public static void main(String[] args) {

        BitMap l = new BitMap(9);


        for (int i = 0; i < 9; i++) {
            l.On(i);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(l.Access(i));
        }
        System.out.println();
        System.out.println();
        System.out.println(l.Rank(5));
        System.out.println(l.Select(2));
    }
}

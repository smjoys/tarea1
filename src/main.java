public class main {
    public static void main(String[] args) {

        BitMap l = new BitMap(5);

        l.On(0);
        l.On(1);

        for (int i = 0; i < 5; i++) {
            System.out.println(l.Access(i));
        }
        System.out.println();
        System.out.println();
        System.out.println(l.Rank(5));

    }
}

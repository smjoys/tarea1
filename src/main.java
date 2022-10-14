public class main {
    public static void main(String[] args) {

        BitMap l = new BitMap(9);
        //No se puede activar el ultimo bit, por favor no lo haga
        l.On(0);
        l.On(6);
        l.On(2);
        l.On(4);
        l.On(8);

        for (int i = 0; i < 5; i++) {
            System.out.println(l.Access(i));
        }
        System.out.println();
        System.out.println();
        System.out.println(l.Rank(5));
        System.out.println(l.Select(9));
    }
}

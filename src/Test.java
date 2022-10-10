public class Test {
    public static void main(String[] args) {
        BitMap m = new BitMap(7);
        m.on(5);
        System.out.print(m.access(5));
    }
}

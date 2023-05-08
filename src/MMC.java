public class MMC {

    public static void main(String[] args) {
        System.out.println(resolver(69,100));
    }

    public static int resolver(int a, int b) {
        return a * (b / mdc(a, b));
    }

    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

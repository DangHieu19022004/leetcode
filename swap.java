public class swap {
    public void swapfunction(int a, int b){
        int c = a;
        a = b;
        b = c;

    }
    public static void main(String arr[]){
        int a = 2;
        int b = 3;
        swap swapF = new swap();
        swapF.swapfunction(a, b);

        System.out.println(a);
        System.out.println(b);
    }
}

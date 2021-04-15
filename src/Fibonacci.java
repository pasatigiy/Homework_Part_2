public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z;
        System.out.print(x+" "+y+" ");
        for (int i =3; i<=11; i++){
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }

    }
}

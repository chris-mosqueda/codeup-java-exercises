public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Another... line");

        int myFavoritNumber = 123;
        System.out.println(myFavoritNumber);

        String myString = "Chris";
        System.out.println(myString);

        char firstLet = 'C';
        System.out.println(firstLet);

        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        int a = 4;
        a += 5;
        System.out.println("a = " + a);

        int b = 3;
        int c = 4;
        c *= b;
        System.out.println(c);

        int m = 10;
        int n = 2;
        m /= n;
        n -= m;
        System.out.println(n);
    }
}

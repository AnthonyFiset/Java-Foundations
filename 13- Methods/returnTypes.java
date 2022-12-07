public class returnTypes {
    
    public static void main(String[] args) {
        
        int x = 3;
        int y = 4;

        add(x, y);

        System.out.println(add(x, y));

    }

    static int add(int x, int y) {
        //You can also just return x + y without the int of z
        int z = x + y;

        return z;

    }

}

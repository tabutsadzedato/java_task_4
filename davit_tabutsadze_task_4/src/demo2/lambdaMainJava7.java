package demo2;

public class lambdaMainJava7 {
    public static void main(String[] args) {
        Sumable obj =new Sumable() {

            @Override
            public int sum(int x, int y) {
                return x+y;
            }


        };

        System.out.println(obj.sum(4, 5));
    }
}
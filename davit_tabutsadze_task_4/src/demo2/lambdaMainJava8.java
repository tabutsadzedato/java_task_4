package demo2;

public class lambdaMainJava8 {
    public static void main(String[] args) {
        Sumable obj = (x, y) -> x + y;

        System.out.println(obj.sum(7, 13));
    }
}
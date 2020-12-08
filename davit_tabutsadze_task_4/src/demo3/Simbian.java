package demo3;

public class Simbian {
    public String toString() {
        return "Simbian";

    }
    void printSimbian() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        (new Simbian()).printSimbian();
        (new Nokia()).printSimbian();
        (new Panasonic()).printSimbian();
    }
}
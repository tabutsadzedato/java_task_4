package demo3;

public class Smartphone {
    public String toString() {
        return "Smartphone";

    }
    void printSmartphone() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        (new Smartphone()).printSmartphone();
        (new IphoneX()).printSmartphone();
        (new SamsungNote()).printSmartphone();
    }
}
package demo3;

public class SamsungNote extends Smartphone {
    private String title = "Samsung Note";
    @Override
    public String toString() {
        return "Smartphone - " + this.title ;
    }

}
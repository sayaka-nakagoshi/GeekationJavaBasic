package objectExercise;

public class Apartment extends Property {
    private String layout;

    Apartment(String adress, String owner, String type, int price, String layout) {
        super(adress, owner, type, price);
        this.layout = layout;
    }

    public void apartment() {
        String line2 = "=============================";
        super.property();
        System.out.println("間取り：" + this.layout);
        System.out.println(line2);
    }

    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
}

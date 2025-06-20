package objectExercise;

public class Land extends Property {
    private Double wide;

    Land(String adress, String owner, String type, int price, double wide) {
        super(adress, owner, type, price);
        this.wide = wide;
    }

    public void land() {
        String line3 = "=============================";
        super.property();
        System.out.println("広さ：" + this.wide + "㎡");
        System.out.println(line3);
    }

    public Double getWide() {
        return this.wide;
    }

    public void setWide(Double wide) {
        this.wide = wide;
    }
}

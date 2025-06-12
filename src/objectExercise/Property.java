package objectExercise;

public class Property {
    private String address;
    private String owner;
    private String type;
    private int price;

    Property(String address, String owner, String type, int price) {
        this.address = address;
        this.owner = owner;
        this.type = type;
        this.price = price;
    }

    public String getAddress() {
        return this.address;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void property() {
        String line = "=============================";
        System.out.println(line);
        System.out.println("物件名：" + this.address);
        System.out.println("物件所有者名：" + this.owner);
        System.out.println("物件種別：" + this.type);
        System.out.println("物件価格：" + this.price + "円");
    }
}

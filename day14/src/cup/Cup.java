package cup;

public class Cup {
    private String itemName;
    private int price;
    private String companyName;

    public Cup(String itemName, int price){
        this.itemName = itemName;
        this.price = price;
        this.companyName = "컵회사";
    }

    public Cup(){
        this.itemName = "입력안됨";
        this.price = 0;
        this.companyName = "컵회사";
    }
}

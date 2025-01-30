package homeworks.homework07;

public class DiscountProduct extends Product{
    private int discount;
    private int deadline;

    public DiscountProduct(String name, int cost, int dc, int dl) {
        super(name, cost);
        this.discount = dc;
        this.deadline = dl;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "name = '" + super.getName() + '\'' +
                ", cost = " + super.getCost() +
                "discount = " + discount +
                ", deadline = " + deadline +
                '}';
    }
}
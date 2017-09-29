package bean;

public class Order {

    private long orderId;
    private String customer;
    private String itemName;
    private Integer itemCount;

    public Order() {
    }

    public Order(long orderId, String customer, String itemName, Integer itemCount) {
        this.orderId = orderId;
        this.customer = customer;
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer='" + customer + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemCount=" + itemCount +
                '}';
    }
}

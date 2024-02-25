package chen.example.exam1.pojo;

/**
 * 超市水果类
 */
public class Fruit {
//    种类
    private String type;
//    单价
    private Double price;
//    重量
    private Integer weight = 0;
//    折扣 默认值为1，即为不打折
    private Double discount = Double.valueOf(1.0);
//    总价
    private Double totalPrice = Double.valueOf(0);

    public Fruit() {

    }

    public Fruit(String type, Double price, Integer weight, Double  discount) {
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

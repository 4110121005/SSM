package cn.edu.xcu.ioc;

public class Car {
    private String brand;
    private Double price;
    public Car() {
        System.out.println("Car的无参构造函数");
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", price=" + price + "]";
    }
}

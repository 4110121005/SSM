package cn.edu.xcu.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    @Value("HuaWei")
    private String brand;
    @Value("10000")
    private Double price;

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", price=" + price + "]";
    }
}

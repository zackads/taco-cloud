package com.example.tacocloud.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class TacoOrder {
    private final List<Taco> tacos = new ArrayList<>();
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}

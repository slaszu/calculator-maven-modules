package pl.slaszu.application;

import pl.slaszu.operation.add.Add;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application started.");
        Add add = new Add();
        BigDecimal res = add.add(BigDecimal.valueOf(3), BigDecimal.valueOf(5));

        System.out.printf("Result : %s%n", res.toString());
    }
}
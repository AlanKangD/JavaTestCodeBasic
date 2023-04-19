package org.example;

import java.util.Objects;

public class Cook {
    private final String food;
    private final int price;

    public Cook(String food, int price) {
        this.food = food;
        this.price = price;
    }

    // 만약 객체들끼리 비교 하기 위해서는 equals 그리고 hashCode라는 것을 추가해주면 되는데 commend + n을 누르면 추가 할 수 있다.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cook cook = (Cook) o;
        return price == cook.price && Objects.equals(food, cook.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, price);
    }
}

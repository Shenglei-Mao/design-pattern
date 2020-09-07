package com.shenglei.singleton.pojo;

public enum RoomType {
    Single(1, 129), Double(2, 199);
    private int capacity;
    private int price;

    RoomType(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}

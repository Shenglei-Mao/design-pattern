package com.shenglei.singleton.pojo;

public class Single {
    int beds;
    int price;

    public Single(int beds, int price) {
        this.beds = beds;
        this.price = price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Single single = (Single) o;
//        return beds == single.beds &&
//                price == single.price;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(beds, price);
//    }
}

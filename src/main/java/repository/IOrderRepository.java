package repository;

import model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOrderRepository implements OrderRepository {
    Map<Integer, List<Order>> cafeOrders = new HashMap<Integer, List<Order>>();

    public void add(Integer key, Order value) {
        cafeOrders.put(key, new ArrayList<Order>());
    }
//    public void put(Integer key, Order value) {
//        cafeOrders.put(key,new ArrayList<Order>());
//
//    }
//
//    public int size() {
//        return cafeOrders.size();
//    }

}





package manager;

import model.Order;
import repository.IOrderRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    Map<Integer, List<Order>> cafeOrders = new HashMap<Integer, List<Order>>();
IOrderRepository orderRepository;
    public void addOrder(int selectedTable,String orderDescription){

        String[] orderStr = orderDescription.split(" ");

        Order order = new Order(Double.parseDouble(orderStr[0]), orderStr[1]);
        cafeOrders.get(selectedTable).add(order);

    }
}

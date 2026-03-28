
package service;

import model.Order;
import model.CustomerType;
import model.Item;
import model.Customer.Status;

public class OrderService {
    
    public static Order processOrder(Order order){
    
        if (order.getItens() == null || order.getItens().isEmpty()) {
            order.setStatus(Status.REJECTED);
            return order;
        }
        
        double total = 0;
        
        for (Item item : order.getItens()) {
            total += item.getTotal();
        }
        
        if (order.getCustomer().getSaldo() < total) {
            order.setStatus(Status.REJECTED);
            return order;
        }
        
        if (order.getCustomer().getTipo() == CustomerType.VIP && total <= 2000) {
            order.setStatus(Status.APPROVED);
            return order;
        }
        
         if (total > 1000) {
            order.setStatus(Status.PENDING);
            return order;
        }
         
        order.setStatus(Status.APPROVED);
        return order;
    }
}

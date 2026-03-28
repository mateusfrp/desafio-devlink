package com.mycompany.desafiobackend;

import model.Customer;
import model.Order;
import model.Item;
import model.CustomerType;
import java.util.Arrays;
import service.OrderService;

public class DesafioBackend {
    public static void main(String[] args) {
        
        //Cliente VIP
        Customer customer1 = new Customer("Elaine", CustomerType.NORMAL, 2500);

        Item item1 = new Item("Mouse", 100, 2);
        Item item2 = new Item("Teclado", 200, 3);

        Order order1 = new Order(1, customer1, Arrays.asList(item1, item2));

        Order result1 = OrderService.processOrder(order1);

        System.out.println("Pedido 1: " + result1.getStatus());
        
        //Cliente NORMAL
        Customer customer2 = new Customer("Iokatan", CustomerType.NORMAL, 1000);

        Order order2 = new Order(2, customer2, Arrays.asList(item1));

        Order result2 = OrderService.processOrder(order2);

        System.out.println("Pedido 2: " + result2.getStatus());
        
        //Cliente Sem Itens
        Order order3 = new Order(3, customer1, Arrays.asList());

        Order result3 = OrderService.processOrder(order3);

        System.out.println("Pedido 3: " + result3.getStatus());
    }
}


package model;

import model.Customer.Status;
import java.util.List;

public class Order {
    
    private int id;
    private Customer customer;
    private List<Item> itens;
    private Status status;
    
    public Order(int id, Customer customer, List<Item> itens){
    
        this.id = id;
        this.customer = customer;
        this.itens = itens;
        this.status = Status.PENDING;
    }
    
    public List<Item> getItens(){
        return itens;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setStatus(Status status){
        this.status = status;
    }
    
    public Status getStatus(){
        return status;
    }
}

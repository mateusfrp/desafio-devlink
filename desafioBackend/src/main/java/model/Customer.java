
package model;

public class Customer {

    public enum CustomerType{
    
        NORMAL,
        VIP
    }
    
    public enum Status{
    
        APPROVED,
        REJECTED,
        PENDING
    }
    
        private String nome;
        private CustomerType tipo;
        private double saldo;
        
        public Customer(String nome, CustomerType tipo, double saldo){
            
            this.nome = nome;
            this.tipo = tipo;
            this.saldo = saldo;
        }
        
        public CustomerType getTipo(){
            return tipo;
        }
        
        public double getSaldo(){
            return saldo;
        }
    }

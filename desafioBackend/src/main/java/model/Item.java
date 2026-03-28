
package model;

public class Item {
    
    private String nome;
    private double preço;
    private int quantidade;
    
    public Item(String nome, double preço, int quantidade){
    
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    
    public double getTotal(){
        return preço * quantidade;
    }
}
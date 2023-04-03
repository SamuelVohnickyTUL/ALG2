/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author samuel.vohnicky
 */
abstract class Client {
    public String name;
    private Account[] ucty;
    
    public Client(String name)
    {
    this.name = name;
    }
    
    public void AddAccount(){
        Account newAccount = new Account(name);
        ucty.Add(newAccount);
    }
    
    public double TotalFinances()
    {
        double total = 0;
        for(int i = 0;i<ucty.length-1;i++){total+=ucty[i].Zustatek;}
        return total;
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author samuel.vohnicky
 */
public class Account {
    private String Vlastnik;
    public double Zustatek;
    
    public Account(String Vlastnik, double Zustatek){
    this.Vlastnik = Vlastnik;
    this.Zustatek = Zustatek;
    }
    
    public Account(String Vlastnik){
    this.Vlastnik = Vlastnik;
    this.Zustatek = 0;
    }
    
    public void deposit(double suma){
        this.Zustatek += suma;
    }
    
    public void withdraw(double suma){
        this.Zustatek -= suma;
    }
}
 
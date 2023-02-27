/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvika;

/**
 *
 * @author samuel.vohnicky
 */
public class MoneyBoxApp {
    public static void main(String[] args)
    {
    MoneyBox Alice = new MoneyBox("Alice",5 ,25);
    MoneyBox Bob = new MoneyBox("Bob");
    Bob.pluskoruna();
    Bob.pluskoruna();
    Bob.plusdvoukoruna();
    Bob.plusdvoukoruna();
    Bob.plusdvoukoruna();
    Bob.plus(5, 10);
    System.out.println(Alice.celkem());
    System.out.println(Bob.celkem());
    //System.out.println(Alice.vypsatkoruny());
    //System.out.println(Bob.vypsatkoruny());
    System.out.println(Alice.jeDostPenez(39));
    System.out.println(Bob.jeDostPenez(39));
    if(Alice.celkem() > Bob.celkem()){System.out.println("alice má více peněz");}
    else {System.out.println("Bob má více peněz");}
    Bob.setV("Alice");
    }
}

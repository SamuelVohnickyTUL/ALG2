/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvika;

/**
 *
 * @author samuel.vohnicky
 */
public class MoneyBox {
    String vlastnik;
        int koruny;
        int dkoruny;
        
    public MoneyBox(String vlastnik,int koruny,int dkoruny){
        this.vlastnik = vlastnik;
        this.koruny=koruny;
        this.dkoruny=dkoruny;
    }
    
    public MoneyBox(String vlastnik){
        this.vlastnik = vlastnik;
        this.koruny=0;
        this.dkoruny=0;
    }
    
    public void setV(String vlastnik){
        this.vlastnik=vlastnik;
    }
    
    public int celkem(){
        return dkoruny*2+koruny;
    }
    
    public void pluskoruna(){
        koruny+=1;
    }
    public void plusdvoukoruna(){
        dkoruny+=1;
    }
    public void plus(int korun,int dvoukorun){
        koruny+=korun;
        dkoruny+=dvoukorun;
    }

    public String vypsatkoruny(){
        return String.format(vlastnik+"má v pokladničce"+celkem()+"kč - %.2f x1Kč,  %.2f x2Kč. " ,koruny , dkoruny);
    }
    
    public boolean jeDostPenez(int cena){
        boolean mapenize = true;
        if (cena>celkem()){mapenize=false;}
        return mapenize;
    }
}

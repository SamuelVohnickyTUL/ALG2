/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv4;

import java.time.LocalTime;

/**
 *
 * @author samuel.vohnicky
 */
public class Zavodnik {
    private String jmeno;
    private String prijmeni;
    private int rocnik;
    private String pohlavi;
    private LocalTime start;
    private LocalTime konec;
    private boolean bezi;
    private int regnum;
    
    
    public Zavodnik(String jmeno,String prijmeni){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        regnum++;
    }
    
    public Zavodnik(String jmeno,String prijmeni, int rocnik){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rocnik = rocnik;
        regnum++;
    }
    
    public Zavodnik(String jmeno,String prijmeni, int rocnik, String pohlavi){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rocnik = rocnik;                                                                                                                                                                                                                                                                                                                                                                                                            
        this.pohlavi = pohlavi;
        regnum++;
    }
    
     public Zavodnik(String jmeno,String prijmeni, String pohlavi){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pohlavi = pohlavi;
        regnum++;
    }
     
    public void setstart(String cas){
        this.start = LocalTime.parse(cas);
    }
    
    public LocalTime getstart(){
        return start;
    }
    
    public void setkonec(String cas){
        this.konec = LocalTime.parse(cas);
    }
    
    public LocalTime getkonec(){
        return konec;
    }
    
    public LocalTime caszavodu(){
        int str = start.toSecondOfDay();
        int knc = konec.toSecondOfDay();
        int doba = knc - str;
        int h = doba/3600;
        int rem = doba%3600;
        int m = rem/60;
        int s = rem%60;
        String res = h+":"+m+":"+s;
        return LocalTime.parse(res);
    }
    
    public boolean beziZavodnik(){
        LocalTime ted = LocalTime.now();
        int str = start.toSecondOfDay();
        int knc = konec.toSecondOfDay();
        int td = ted.toSecondOfDay();
        if (td > str && td<knc){bezi = true;}
        else {bezi = false;}
        return bezi;
    }
            
}

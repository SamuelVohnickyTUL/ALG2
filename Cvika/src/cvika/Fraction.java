/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv2;

/**
 *
 * @author samuel.vohnicky
 */
public class Fraction {
    int cit;
    int jmen;
    
    public Fraction(int cit,int jmen){
        this.cit = cit;
        this.jmen = jmen;
    }
    
    public Fraction(int ct){
        this.cit = ct;
        this.jmen = 1;
    }
    
    public Fraction(String zl){
        String[] zlm  = zl.split("/");
        this.cit = Integer.parseInt(zlm[0]);
        this.jmen = Integer.parseInt(zlm[1]);
    }
    
    public void zt(){
        if(cit % jmen == 0){cit = cit/jmen;jmen =1;}
        if(jmen % cit == 0){jmen = jmen/cit;cit =1;}
        int m =0;
        if(cit<jmen){m = cit;}
        else {m = jmen;}
        for(int i=1;i<m;i++){
            if(cit % m == 0 && jmen % m ==0){cit = cit/m;jmen = jmen/m;}
        }
    }
    
    public int getcit(){
        return cit;
    }
    
    public int getjmen(){
        return jmen;
    }
    
    public double val(){
        double d = this.cit/(double) this.jmen;
        return d;
    }
    public String toString(){
        String f;
        if (jmen != 1){
            f = cit+"/"+jmen;
        }
        else {
            f = Integer.toString(cit);
        }
        return f;
    }
}

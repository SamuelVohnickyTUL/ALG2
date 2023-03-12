/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Majitel
 */
public class FractionTools {
    public String soucet(String a, String b)
    {
        String[] azlm = a.split("/");
        int ac = Integer.parseInt(azlm[0]);
        int aj = Integer.parseInt(azlm[1]);
        
        String[] bzlm = a.split("/");
        int bc = Integer.parseInt(bzlm[0]);
        int bj = Integer.parseInt(bzlm[1]);
        
        String res = "";
        
        if (aj==bj){
            int cc = ac + bc;
            int cj = aj;
            res = cc+"/"+cj; 
        }
        else{
            int nbc = aj*bc;
            
            int nac = bj*ac;
            int naj = bj*aj;
            int cc = nac+nbc;
            int cj = naj;
            
            
            if (cc % cj == 0) {
            cc /= cj;
            cj = 1;
        }
        if (cj % cc == 0) {
            cj /= cc;
            cc = 1;
        }
        int m = 0;
        if (cc < cj) {
            m = cc;
        }
        else {
            m = cj;
        }
        for (int i = 1; i < m; ++i) {
            if (cc % m == 0 && cj % m == 0) {
                cc /= m;
                cj /= m;
            }
        }
        res = cc+"/"cj;
        }
        return res;
    }
    
    public String soucin String a, String b)
    {
        String[] azlm = a.split("/");
        int ac = Integer.parseInt(azlm[0]);
        int aj = Integer.parseInt(azlm[1]);
        
        String[] bzlm = a.split("/");
        int bc = Integer.parseInt(bzlm[0]);
        int bj = Integer.parseInt(bzlm[1]);
        
        String res = "";
        
        if (aj==bj){
            int cc = ac * bc;
            int cj = aj;
            res = cc+"/"+cj; 
        }
        else{
            int nbc = aj*bc;
            
            int nac = bj*ac;
            int naj = bj*aj;
            int cc = nac*nbc;
            int cj = naj;
            
            
            if (cc % cj == 0) {
            cc /= cj;
            cj = 1;
        }
        if (cj % cc == 0) {
            cj /= cc;
            cc = 1;
        }
        int m = 0;
        if (cc < cj) {
            m = cc;
        }
        else {
            m = cj;
        }
        for (int i = 1; i < m; ++i) {
            if (cc % m == 0 && cj % m == 0) {
                cc /= m;
                cj /= m;
            }
        }
        res = cc+"/"cj;
        }
        return res;
    }
    
    public String podil(String a, String b)
    {
        String[] azlm = a.split("/");
        int ac = Integer.parseInt(azlm[0]);
        int aj = Integer.parseInt(azlm[1]);
        
        String[] bzlm = a.split("/");
        int bc = Integer.parseInt(bzlm[0]);
        int bj = Integer.parseInt(bzlm[1]);
        
        String res = "";
        
        if (aj==bj){
            int cc = ac / bc;
            int cj = aj;
            res = cc+"/"+cj; 
        }
        else{
            int nbc = aj*bc;
            
            int nac = bj*ac;
            int naj = bj*aj;
            int cc = nac/nbc;
            int cj = naj;
            
            
            if (cc % cj == 0) {
            cc /= cj;
            cj = 1;
        }
        if (cj % cc == 0) {
            cj /= cc;
            cc = 1;
        }
        int m = 0;
        if (cc < cj) {
            m = cc;
        }
        else {
            m = cj;
        }
        for (int i = 1; i < m; ++i) {
            if (cc % m == 0 && cj % m == 0) {
                cc /= m;
                cj /= m;
            }
        }
        res = cc+"/"cj;
        }
        return res;
    }
    
    public String rozdíl(String a, String b)
    {
        String[] azlm = a.split("/");
        int ac = Integer.parseInt(azlm[0]);
        int aj = Integer.parseInt(azlm[1]);
        
        String[] bzlm = a.split("/");
        int bc = Integer.parseInt(bzlm[0]);
        int bj = Integer.parseInt(bzlm[1]);
        
        String res = "";
        
        if (aj==bj){
            int cc = ac - bc;
            int cj = aj;
            res = cc+"/"+cj; 
        }
        else{
            int nbc = aj*bc;
            
            int nac = bj*ac;
            int naj = bj*aj;
            int cc = nac-nbc;
            int cj = naj;
            
            
            if (cc % cj == 0) {
            cc /= cj;
            cj = 1;
        }
        if (cj % cc == 0) {
            cj /= cc;
            cc = 1;
        }
        int m = 0;
        if (cc < cj) {
            m = cc;
        }
        else {
            m = cj;
        }
        for (int i = 1; i < m; ++i) {
            if (cc % m == 0 && cj % m == 0) {
                cc /= m;
                cj /= m;
            }
        }
        res = cc+"/"cj;
        }
        return res;
    }
            
}

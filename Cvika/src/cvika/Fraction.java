// 
// Decompiled by Procyon v0.5.36
// 

package cv2;

public class Fraction
{
    int cit;
    int jmen;
    
    public Fraction(final int cit, final int jmen) {
        this.cit = cit;
        this.jmen = jmen;
    }
    
    public Fraction(final int ct) {
        this.cit = ct;
        this.jmen = 1;
    }
    
    public Fraction(final String zl) {
        final String[] zlm = zl.split("/");
        this.cit = Integer.parseInt(zlm[0]);
        this.jmen = Integer.parseInt(zlm[1]);
    }
    
    public void zt() {
        if (this.cit % this.jmen == 0) {
            this.cit /= this.jmen;
            this.jmen = 1;
        }
        if (this.jmen % this.cit == 0) {
            this.jmen /= this.cit;
            this.cit = 1;
        }
        int m = 0;
        if (this.cit < this.jmen) {
            m = this.cit;
        }
        else {
            m = this.jmen;
        }
        for (int i = 1; i < m; ++i) {
            if (this.cit % m == 0 && this.jmen % m == 0) {
                this.cit /= m;
                this.jmen /= m;
            }
        }
    }
    
    public int getcit() {
        return this.cit;
    }
    
    public int getjmen() {
        return this.jmen;
    }
    
    public double val() {
        final double d = this.cit / (double)this.jmen;
        return d;
    }
    
    @Override
    public String toString() {
        String f;
        if (this.jmen != 1) {
            f = invokedynamic(makeConcatWithConstants:(II)Ljava/lang/String;, this.cit, this.jmen);
        }
        else {
            f = Integer.toString(this.cit);
        }
        return f;
    }
}

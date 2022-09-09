package ss4_lop_va_doi_tuong.Pt_bac_2;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {

    }

    public void setterAll(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return this.a;
    }
    public double getterB() {
        return this.b;
    }
    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (getterB()*getterB()) - (4 * getterA() * getterC());
    }
    public double getRood1() {
        if (getDiscriminant() >= 0) {
            return (- getterB() + Math.sqrt(getDiscriminant())) / (2 * getterA());
        } else {
            return 0;
        }
    }
    public double getRood2() {
        if (getDiscriminant() >= 0) {
            return (- getterB() - Math.sqrt(getDiscriminant())) / (2 * getterA());
        } else {
            return 0;
        }
    }
}

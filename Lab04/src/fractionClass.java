/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class fractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFractoin(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
    }
    
}
class Fraction{
    int topN, btmN;
    public String toFraction(){
        return (topN + "/" + btmN);
    }
    public String toFloat(){
        double fir = (double) topN / btmN;
        return String.valueOf(fir);
    }
    public void addFractoin(Fraction f){
        if (this.btmN == f.btmN){
            this.topN = this.topN + f.topN;
            this.btmN = this.btmN * f.btmN;
        }else{
            this.topN = (this.topN * f.btmN) + (f.topN * this.btmN);
            this.btmN = (this.btmN * f.btmN);
        }
    }
    public boolean myEquals(Fraction x){
        return (this.btmN == x.btmN);
    }
    public void LowestTermFrac(){
        btmN = topN / btmN;
    }
}
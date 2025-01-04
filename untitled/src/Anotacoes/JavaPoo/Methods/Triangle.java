package Anotacoes.JavaPoo.Methods;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double calculeArea (){
        double pY = (a + b + c) / 2;
        return Math.sqrt(pY * (pY-a) * (pY - b) * (pY - c));
    }
}


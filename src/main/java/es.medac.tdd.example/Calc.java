package es.medac.tdd.example;

public class Calc {
    int a;
    int b;

    public Calc(int i, int i1) {
        this.a=i;
        this.b = i1;
    }

    public Integer sumar() {
        return a+b;
    }

    public Integer restar() {
        return a-b;
    }

    public Integer mult() {
        return a*b;
    }

    public Integer div() {
        return a/b;
    }
}

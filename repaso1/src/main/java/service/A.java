package service;

public class A {
    private B b1;

    public A(B b1) {
        this.b1 = b1;
    }

    public A( ) {
        this( new B () );
    }

    public B getB1() {
        return b1;
    }

    public void setB1(B b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "A{" +
                "b1=" + b1 +
                '}';
    }
}

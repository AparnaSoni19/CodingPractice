package java8programpractice;

public class TestLamdaExpression {
    public static void main(String[] args) {
        int l =5;
        int m =15;
        Square square =(x,z)->l*m;
        System.out.println(square.calculate(l,m));
    }
}

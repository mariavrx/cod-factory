package gr.aueb.cf.ch3;

public class MyCalculator {
    public static void main(String[] args) {
        int num1 =3;
        int num2= 5;
        int result =0;

        result= mul(num1, num2);
        System.out.println("Result:" + result);
    }
    public static int mul(int a, int b){
        return a * b;
    }

}
}

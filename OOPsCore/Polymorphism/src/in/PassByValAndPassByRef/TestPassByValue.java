package in.PassByValAndPassByRef;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x , y);
        System.out.printf("x=%d , y=%d  , sum=%d",x , y , sum);
    }

    public static int add(int x, int y){
       // return x + y;
        // a += b;
        // return a;
        x = 99; // meaning of pass by value is that you are not changing original, but you can change copied value
        return x;
    }
}

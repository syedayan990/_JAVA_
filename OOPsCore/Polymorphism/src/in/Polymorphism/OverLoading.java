package in.Polymorphism;

public class OverLoading {

    OverLoading() {
        System.out.println("Inside OverLoading");
    }

    OverLoading(String name) {
        System.out.println("Inside String OverLoading");
    }


    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    public static class dog {
        public void bark() {
            System.out.println("Dog bark");
        }

        public void bark(int num) {
            for (int i = 0; i < num; i++) {
                System.out.println("Dog bark");
            }
        }


    }

    static void main(String[] args) {
        OverLoading overload = new OverLoading();
        int sum = overload.add(4, 5);
        overload.add("aba", "bab");
        System.out.println(overload.add(1, 2, 3, 4));
        dog Dog = new dog();
        Dog.bark(5);
    }

}

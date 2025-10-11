package OOPs;

class Shape {
    String color;

    public void area() {
        System.out.println("display area");
    }
}

class Tringle extends Shape {
    public void area(int l, int b) {
        System.out.println(0.5 * l * b);
    }

}

public class inheritanxe {
    public static void main(String[] args) {
        Tringle t1 = new Tringle();
        t1.area(12, 18);
    }
}

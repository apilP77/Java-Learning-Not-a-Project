package OOPs;

class Studentss {

    public void printinfo(String name) {
        System.out.println("Name is " + name);

    }

    public void printinfo(int age) {
        System.out.println("Age is " + age);

    }
}

public class polymorphsim {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        s1.printinfo("ram");
        s1.printinfo(12);
    }
}

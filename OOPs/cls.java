package OOPs;

class Student {
    int age;
    String name;

    public void printinfo() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);

    }
}

public class cls {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Apson Poudel";

        s1.printinfo();
    }

}

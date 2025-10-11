package OOPs;

class Students {

    int age;
    String name;

    Students() {
    }// default

    Students(int age) {
        this.age = age;

    }

    Students(int age, String name) {// parametized
        this.age = age;
        this.name = name;

    }

    Students(Students s) {// copy construstor
        this.name = s.name;
        this.age = s.age;

    }

    public void printinfo() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}

public class constructorexe {
    public static void main(String[] args) {
        Students s1 = new Students(21, "apil");
        // s1.printinfo();
        Students s2 = new Students(s1);
        s2.printinfo();
    }
}

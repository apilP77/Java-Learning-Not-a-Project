package StringBuilder;

public class appending {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("h");

        sb.append('e');// he
        System.out.println(sb);
        sb.append('l');// hel
        System.out.println(sb);
        sb.append("lo");// hello

        System.out.println(sb);
    }
}

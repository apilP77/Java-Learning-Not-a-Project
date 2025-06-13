package StringBuilder;

public class basicIO {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);
        // printing 3 place value
        System.out.println(sb.charAt(3));
        // changing tony into pony
        sb.setCharAt(0, 'p');

        System.out.println(sb);

        // inserting

        sb.insert(0, 's');

        System.out.println(sb);

        // deleting s
        sb.delete(0, 1);

        System.out.println(sb);
    }
}

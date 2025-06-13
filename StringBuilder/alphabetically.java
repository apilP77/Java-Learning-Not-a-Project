package StringBuilder;

public class alphabetically {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 1; j < sb.length() - 1; j++) {
                char first = sb.charAt(i);
                char second = sb.charAt(j);
                if (first > second) {

                    sb.setCharAt(i, second);
                    sb.setCharAt(j, first);

                }

            }

        }
        System.out.println(sb);
    }
}

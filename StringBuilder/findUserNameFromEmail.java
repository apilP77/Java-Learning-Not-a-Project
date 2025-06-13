package StringBuilder;

public class findUserNameFromEmail {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello@mob");
        int i = 0;
        while (sb.charAt(i) != '@') {
            i++;

        }

        System.out.println(sb.substring(0, i));

    }
}

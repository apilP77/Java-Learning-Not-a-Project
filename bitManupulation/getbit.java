package bitManupulation;

public class getbit {

    public static void main(String[] args) {

        int n = 5;
        int pos = 2;

        int bitmas = 1 << pos;

        if ((bitmas & n) == 0) {
            System.out.println("Bit was Zero");

        } else {
            System.out.println("Bit was Non Zero");
        }
    }
}

package bitManupulation;

public class q2 {
    public static void main(String[] args) {
        // toggle a bit of a place
        int n = 6;
        int pos = 1;
        int bitIs;
        int newbit;
        // first we have to get the bit

        int bitmas = 1 << pos;

        if ((bitmas & n) == 0) {
            bitIs = 0;
        } else {
            bitIs = 1;
        }

        if (bitIs == 0) {
            System.out.println(bitmas | n);

        } else {
            newbit = ~bitmas;
            System.out.println(newbit & n);
        }
    }
}

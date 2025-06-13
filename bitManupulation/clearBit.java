package bitManupulation;

public class clearBit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;

        int bitmas = ~(1 << pos);

        System.err.println(bitmas & n);
    }
}

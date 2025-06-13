package bitManupulation;

public class setbit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 1;
        int bitmas = 1 << pos;

        System.out.println(bitmas | n);
    }
}

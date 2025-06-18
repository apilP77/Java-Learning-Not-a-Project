package Intermediate;

public class q7 {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombo(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String map = keypad[currChar - '0'];
        for (int i = 0; i < map.length(); i++) {

            printCombo(str, idx + 1, combination + map.charAt(i));

        }
    }

    public static void main(String[] args) {
        String str = "45";
        printCombo(str, 0, "");
    }
}

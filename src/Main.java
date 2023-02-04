import java.util.*;

public class Main {

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        String text1 = text.toLowerCase();
        for (int i = 0; i < text1.length(); i++) {
            char symbol = text1.charAt(i);
            if (Character.isLetter(symbol)) {
                if (!map.containsKey(symbol)) {
                    map.put(symbol, 1);
                } else {
                    int value = map.remove(symbol);
                    map.put(symbol, value + 1);
                }
            }
        }
        System.out.println(max(map));
        System.out.println(min(map));
    }

    public static String max(Map<Character, Integer> map) {
        int value = 1;
        char key1 = '0';
        for (char key : map.keySet()) {
            int value1 = map.get(key);
            if (value < value1) {
                value = value1;
                key1 = key;
            }
        }
        return ("Чаще всего встречалась буква " + key1 + " - " + value + " р.");
    }

    public static String min(Map<Character, Integer> map) {
        int value = Integer.MAX_VALUE;
        char key1 = '0';
        for (char key : map.keySet()) {
            int value1 = map.get(key);
            if (value > value1) {
                value = value1;
                key1 = key;
            }
        }
        return ("Реже всего встречалась буква " + key1 + " - " + value + " р.");
    }
}


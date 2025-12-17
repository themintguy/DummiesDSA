package Main.K31.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Strings {

    private static int printASCII(char ch) {
        // 0-9 48 to 57
        // A-Z 65 to 90
        // a-z 97 to 122
        int charValue = (int) ch;
        return charValue;
    }

    private static int[] countCharacters(String str) {
        int[] count = new int[3];
        int letters = 0, numbers = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                numbers++;
            } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                letters++;
            } else {
                special++;
            }
        }
        count[0] = letters;
        count[1] = numbers;
        count[2] = special;
        return count;
    }

    private static void countCharactersBuiltIn(String str) {
        int letters = 0, digits = 0, special = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                letters++;
            } else {
                special++;
            }
        }
    }

    private static int diffVowelsConsonats(String str) {
        int vowels = 0, cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                cons++;
            }
        }
        return (Math.abs(vowels - cons));
    }

    private static String caseConvert(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return String.valueOf(sb);
    }

    private static String caseConvertAsicii(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch & '_');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch | ' ');
            }
            sb.append(ch);
        }
        return String.valueOf(sb);
    }

    private static String removeExtraSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        return str;
    }

    private static int countWordsinStr(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        str = str.trim();
        int count = 0;
        boolean word = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                if (!word) {
                    count++;
                    word = true;
                }
            } else {
                word = false;
            }
        }
        return count;
    }

    private static void minMaxChars(String str) {
        str = str.trim().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char minKey = ' ';
        char maxKey = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            char key = entry.getKey();

            if (value < min) {
                min = value;
                minKey = key;
            }
            if (value > max) {
                max = value;
                maxKey = key;
            }
        }
        System.out.println("min " + min + " " + minKey);
        System.out.println("max " + max + " " + maxKey);
    }

    public static void main(String[] args) {
        minMaxChars("KranthiKumarBanda");
    }
}

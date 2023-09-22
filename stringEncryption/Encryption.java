
package stringEncryption;

import java.util.*;

public class Encryption {
    public static void main(String[] args) {

    }

    public static String encryption(String s) {

        if (s.contains(" ")) s = s.trim();

        int len = s.length();
        int columns = (int) Math.ceil(Math.sqrt(len));

        List<String> list = new ArrayList<>();

        while (!s.isEmpty()) {
            if (s.length() > columns) {
                list.add(s.substring(0, columns));
                s = s.substring(columns);
            } else {
                list.add(s);
                s = "";
            }
        }

        StringBuilder sb = new StringBuilder();
        int line = 0, charIndex = 0, count = 0;

        while (sb.toString().replaceAll(" ", "").length() != len) {
            if (line < list.size()) {
                String str = list.get(line++);
                if (str.length() > charIndex) sb.append(str.charAt(charIndex));
            } else {
                line = 0;
                charIndex++;
                sb.append(" ");
            }
        }


        return sb.toString().trim();
    }

}





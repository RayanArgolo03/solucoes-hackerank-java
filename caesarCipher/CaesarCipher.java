
package caesarCipher;

public class CaesarCipher {

    public static void main(String[] args) {
    }


    public static String caesarCipher(String s, int k) {

        StringBuilder sb = new StringBuilder();
        boolean hasModified = false;
        int codePoint;

        for (char c : s.toCharArray()) {

            if (Character.isLetter(c)) {

                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                    hasModified = true;
                }

                if ((c + k) >= 'z') {

                    int temp = 0;
                    while (temp++ < k) {
                        if (c == 122) {
                            c = 97;
                        } else {
                            c++;
                        }
                    }

                    codePoint = c;

                } else {
                    codePoint = c + k;
                }

                sb.append((hasModified)
                        ? Character.toUpperCase((char) codePoint)
                        : (char) codePoint);

            } else {
                sb.append(c);
            }


            hasModified = false;
        }

        return sb.toString();
    }
}



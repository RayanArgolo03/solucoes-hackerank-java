
package buildString;

public class BuildString {

    public static void main(String[] args) {
        System.out.println(buildString(2, 4, "baaceacmbaaceam"));
    }

    public static int buildString(int a, int b, String s) {

        int money = 0;
        StringBuilder aux = new StringBuilder();
        int i = 0;
        boolean hasSubstring = false;

        while (i < s.length()) {

            char c = s.charAt(i);
            if (aux.length() >= 2 && aux.toString().indexOf(c) > -1) {

                int auxIndex = 0;
                StringBuilder temp = new StringBuilder().append(c);

                inner:
                while (auxIndex < aux.length() - 1) {

                    if (i == s.length() - 1 && aux.charAt(auxIndex) == s.charAt(i)) {
                        temp.append(aux.charAt(auxIndex));
                        break inner;
                    }

                    else if (aux.charAt(auxIndex + 1) == s.charAt(i + 1)) {
                        temp.append(aux.charAt(auxIndex + 1));
                        i++;
                    }

                    auxIndex++;
                }

                if (temp.length() > 1) {
                    aux.append(temp);
                    hasSubstring = true;
                }
            }


            if (hasSubstring) {
                money += b;
                hasSubstring = false;
            } else {
                aux.append(c);
                money += a;
            }

            i++;
        }

        return money;
    }

}



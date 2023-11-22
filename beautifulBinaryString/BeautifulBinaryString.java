
package beautifulBinaryString;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0101010"));
    }

    public static int beautifulBinaryString(String b) {

        int count = 0;
        int i = 0;
        int finall = i + 3;

        while (finall < b.length() + 1) {
            if (b.substring(i, finall).equals("010")) {
                count++;
                i = finall;
                finall += 3;
            } else {
                i++;
                finall++;
            }
        }

        return count;
    }

}



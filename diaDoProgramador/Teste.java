package diaDoProgramador;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
    }

    public static String dayOfProgrammer(int year) {

        if (year == 1918) {
            return "26.09.1918";
        }

        boolean anoBissexto = false;

        if (year > 1918) {
            anoBissexto = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        } else {
            anoBissexto = year % 4 == 0;
        }

        LocalDate localDate = LocalDate.of(year, 1, 1);
        int count = 0;

        for (int i = 1; i <= 8; i++) {
            count += localDate.getMonth().length(anoBissexto);
            localDate = localDate.plusMonths(1);
        }

        int value = 256 - count;
        localDate = LocalDate.of(year, 9, value);

        String res = String.format("%d.%02d.%d", localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());

        return res;
    }

}

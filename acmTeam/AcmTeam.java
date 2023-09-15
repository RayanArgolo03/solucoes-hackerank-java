package acmTeam;

import java.util.Arrays;
import java.util.List;

public class AcmTeam {
    public static void main(String[] args) {

    }

    public static List<Integer> acmTeam(List<String> topic) {

        int atendees = topic.size();
        int maxValue = 0;
        int countEquips = 0;

        for (int atendeeI = 1; atendeeI < atendees; atendeeI++) {
            String topicsI = topic.get(atendeeI - 1);

            for (int atendeeJ = atendeeI + 1; atendeeJ <= atendees; atendeeJ++) {

                int count = 0;
                String topicsJ = topic.get(atendeeJ - 1);

                for (int i = 0; i < topic.get(i).length(); i++) {
                    if (topicsI.charAt(i) == '1' || topicsJ.charAt(i) == '1') {
                        count++;
                    }
                }

                if (count > maxValue) {
                    countEquips = 1;
                }
                else if (count == maxValue) {
                    countEquips++;
                }

                maxValue = Math.max(count, maxValue);
            }
        }

        return Arrays.asList(maxValue, countEquips);
    }
}

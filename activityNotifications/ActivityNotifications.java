package activityNotifications;

import java.util.List;
import java.util.stream.Collectors;

public class ActivityNotifications {


    public static int activityNotifications(List<Integer> expenditure, int d) {

        int days = expenditure.size();
        int notifications = 0;
        int median;
        int spent;
        int skipIndex = 0;
        int limitIndex = 1;

        for (int day = d + 1; day <= days; day++) {

            List<Integer> finalExpenditures = expenditure.stream()
                    .skip(skipIndex)
                    .limit(day - limitIndex)
                    .sorted()
                    .collect(Collectors.toList());

            //Concertar problema da média par
            median = finalExpenditures.get(finalExpenditures.size() / 2);
            spent = expenditure.get(day - 1);

            if (spent >= median * 2) {
                notifications++;
            }

            skipIndex++;
            limitIndex++;
        }

        return notifications;
    }

}

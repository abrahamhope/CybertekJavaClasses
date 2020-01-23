package replit200;

import java.util.ArrayList;

public class Replit211DeliveryCalc {
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int sum = 0;
        for (int i = 0; i < deliveries.size(); i++) {
            sum += deliveries.get(i);
        }
        int times = sum / max_fuel;
        if (sum % max_fuel != 0) {
            times++;
        }
        return times;

    }
}

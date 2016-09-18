package Lection5;

import java.util.Arrays;

/**
 * Created by Администратор on 18.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println(Arrays.deepToString(controller.requestRooms(500, 1, "Chelyabinsk")));
        System.out.println(Arrays.deepToString(controller.check(new TripAdvisorApi(), new BookingComAPI())));

    }
}

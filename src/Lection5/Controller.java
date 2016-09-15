package Lection5;

/**
 * Created by Администратор on 15.09.2016.
 */
public class Controller {
    private API apis[] = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        TripAdvisorApi tripAdvisorApi = new TripAdvisorApi();
        apis[1] = tripAdvisorApi;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;
    }
}

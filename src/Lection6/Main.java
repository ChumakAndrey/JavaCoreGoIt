package Lection6;

import java.util.Arrays;

/**
 * Created by Администратор on 05.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Artur", "First", 200, 200);
        User user2 = new User("Lesly", "Second", 300, 300);
        User user3 = new User("Jhon", "Third", 400, 400);
        User user4 = new User("Megan", "Fourth", 500, 500);
        User user5 = new User("Valery", "Fifth", 600, 600);
        User user6 = null;
        User user7 = user2, user8 = null, user9 = null, user10 = null;

        User[] allUsers = new User[10];
        allUsers[0] = user1;
        allUsers[1] = user2;
        allUsers[2] = user3;
        allUsers[3] = user7;
        allUsers[4] = user6;
        allUsers[5] = user8;
        allUsers[6] = user9;
        allUsers[7] = user10;
        allUsers[8] = user5;
        allUsers[9] = user4;


        UsersUtils.getUsersId(allUsers);
        System.out.println(Arrays.deepToString(UsersUtils.deleteEmptyUsers(allUsers)));
        System.out.println(Arrays.deepToString(UsersUtils.paySalaryToUsers(allUsers)));
        System.out.println(Arrays.toString(UsersUtils.usersWithConditionalBalance(allUsers, 400)));



    }
}

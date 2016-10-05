package Lection6;

/**
 * Created by Администратор on 26.09.2016.
 */
public final class UsersUtils {

    static User[] uniqueUsers(User[] users){
        int j = 0;
        User[] uniqueUsers = new User[10];
        for (int i = 1; i <users.length; i++) {
            for (User user : users) {
                if( !users[i].equals(user)){
                        uniqueUsers[j] = users[i];
                j++;
                }
            }
        }
        return uniqueUsers;
    }


    static User[] usersWithConditionalBalance(User[] users, int balance){
        User[] usersWithConditionalBalance = new User[10];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if(balance == users[i].getBalance()){
                usersWithConditionalBalance[j] = users[i];
                j++;
            }
        }
        return usersWithConditionalBalance;
    }


    static final User[] paySalaryToUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }


    static final long[] getUsersId(User[] users){
        long[] usersId = new long[10];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersId[j] = users[i].getId();
            }
        }
        return usersId;}


    static User[] deleteEmptyUsers(User[] users){

        int k = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null) {
                users[k] = users[i];
            }
        }

        return users;
    }

}

package Lection6;

/**
 * Created by Администратор on 26.09.2016.
 */
public final class UsersUtils {

    static User[] uniqueUsers(User[] users){
        int j = 0;
        User[] uniqueUsers = new User[10];
        for (int i = 1; i <users.length; i++) {
                if( !users[i].equals(users[0])){
                        uniqueUsers[j] = users[i];
                j++;
            }
        }
        return uniqueUsers;
    }


    static User[] usersWithConditionalBalance(User[] users, int balance){
        User[] usersWithConditionalBalance = new User[10];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if(users[i]!= null){
            if(balance == users[i].getBalance()){
                usersWithConditionalBalance[j] = users[i];
                j++;
            }
            }
        }
        return usersWithConditionalBalance;
    }


    static final User[] paySalaryToUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            if(users[i]!= null){
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
            }
        }
        return users;
    }


    static final long[] getUsersId(User[] users){
        long[] usersId = new long[10];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersId[j] = users[i].getId();
                System.out.println(users[i].getFirstName() + "'s ID is " + users[i].getId());
                j++;
            }
        }
        return usersId;}


    static User[] deleteEmptyUsers(User[] users){
        int k = 0;
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null) {
                k++;
            }
        }
        User[] withoutEmptyUsers = new User[k];
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null) {
                withoutEmptyUsers[j] = users[i];
                j++;
            }
        }
        return withoutEmptyUsers;
    }




}

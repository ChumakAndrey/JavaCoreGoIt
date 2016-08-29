package Lection2.Task4;

/**
 * Created by Администратор on 28.08.2016.
 */
public class FundBalance {
    int[] balances = {1200, 250, 200, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {
        FundBalance test = new FundBalance();
        test.fund("Jack", 800);
    }



    public void fund (String ownerName, int fund) {
        String result;
        int x = this.findNumberInMass(ownerNames, ownerName);
        balances[x] = balances[x] + fund;
            result = ownerNames[x] + " " + balances[x];
        System.out.println(result);
    }

    public int findNumberInMass(String[] owners, String ownerName) {
        for (int i = 0; i < owners.length; i++) {
            if (ownerName == owners[i]) {
                return i;
            }
        }
        return -1;
    }
}

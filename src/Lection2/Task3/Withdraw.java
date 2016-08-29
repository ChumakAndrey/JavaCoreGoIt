package Lection2.Task3;


public class Withdraw {
    int[] balances = {1200, 250, 200, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int commision = 5;

    public static void main(String[] args) {
        Withdraw test = new Withdraw();
        System.out.println(test.withdrawal("Jane", 100 ));
        System.out.println(test.withdrawal("Oww", 490));

    }

    public String withdrawal (String ownerName, double withdrawal) {
        String result;
        int x = this.findNumberInMass(ownerNames, ownerName);
        double withdrawalSum = withdrawal + withdrawal*commision/100;
        if (withdrawalSum > balances[x]){
            result = "NO";
        }
        else {
            balances[x] = balances[x] - (int)withdrawalSum;
            result = ownerNames[x] + " " + (int)withdrawal + " " + balances[x];
        }
        return result;
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

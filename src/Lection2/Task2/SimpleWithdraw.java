package Lection2.Task2;

public class SimpleWithdraw {

    public static void main(String[] args) {
        SimpleWithdraw test = new SimpleWithdraw();
        System.out.println(test.simpleWithdraw(500, 450));
    }

    static float commision = 5;
    public String simpleWithdraw (int bal, int withdrawal) {
        String result;
        float withdrawSum = withdrawal + withdrawal*commision/100;
        float finalSum = bal - withdrawSum;
        if((int)withdrawSum<=bal) {
            result = "OK " + commision + "% " + " " + finalSum;
        }
        else result = "NO";

        return result;
    }

}

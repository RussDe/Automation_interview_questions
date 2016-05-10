package Ox_meetup;

public class PowerResult {

    int power(int base, int Power) {
        if (Power == 0)
            return 1;
        else
        return base*power(base, Power - 1);
    }

    public static void main(String[] args) {
        PowerResult pr = new PowerResult();
        System.out.println("Power is " + pr.power(2, 3));


    }
}

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbersList.add(random.nextInt(100));
        }
        System.out.println("Numbers List = " + numbersList);

        ArrayList<Integer> oddNumbersList = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) %2 == 1) {
                oddNumbersList.add(numbersList.get(i));
            }
        }
        System.out.println("Odd Numbers List = " + oddNumbersList);

        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) %2 == 0) {
                evenNumbersList.add(numbersList.get(i));
            }
        }
        System.out.println("Even Numbers List = " + evenNumbersList);

    }
}
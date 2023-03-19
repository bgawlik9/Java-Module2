import java.util.Random;

public class RandomNumbers {

    Random random = new Random();
    int range = 5000;
    int sum;

    int minNumber = 30;

    public int getMin(int podajliczbe)
    {
        System.out.println(minNumber);
        return minNumber;
    }

    int maxNumber = 0;


    public int getMax(int podajliczbe)
    {
       System.out.println(maxNumber);
        return maxNumber;
    }

    public void drawingNumber(){


        for (int i = 0; i <= range ; i++) {
            if (sum <= range) {
                int temp = random.nextInt(31);
                sum += temp;
                System.out.println("interacja nr: " + i);
                System.out.println("losowa liczba : " + temp);
                System.out.println("suma liczb wynosi: " + sum);
                System.out.println("koniec interacji");
                int max = this.maxNumber;
                int min = this.minNumber;
                if (max < temp){
                    maxNumber = temp;
                }
                if (min > temp){
                    minNumber = temp;

                }
                }
            }

        }







    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.drawingNumber();
        randomNumbers.getMax(0);
        randomNumbers.getMin(30);

    }

}

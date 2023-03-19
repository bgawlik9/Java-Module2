import java.util.Scanner;

public class Colors {




    public static String getUserColorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select Color (B - blue, G - green, P - pink, R - red, O - orange, W - white, Y - yellow):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    System.out.println("Blue");
                    break;
                case "G":
                    System.out.println("Green");
                    break;
                case "P":
                    System.out.println("Pink");
                    break;
                case "R":
                    System.out.println("Red");
                    break;
                case "O":
                    System.out.println("Orange");
                    break;
                case "W":
                    System.out.println("White");
                    break;
                case "Y":
                    System.out.println("Yellow");
                    break;
                default:
                    System.out.println("Bad color. Try again.");
            }
        }

    }


    public static void main(String[] args) {
        Colors.getUserColorSelection();
    }
}
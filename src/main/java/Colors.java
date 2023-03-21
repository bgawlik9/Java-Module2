import java.util.Scanner;

public class Colors {




    public static String getUserColorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select Color (B - blue, G - green, P - pink, R - red, O - orange, W - white, Y - yellow):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "BLUE";
                case "G":
                    return "GREEN";
                case "P":
                    return "PINK";
                case "R":
                    return "RED";
                case "O":
                    return "ORANGE";
                case "W":
                    return "WHITE";
                case "Y":
                    return "YELLOW";
                default:
                    System.out.println("Bad color. Try again.");
            }
        }

    }


    public static void main(String[] args) {
        System.out.println(Colors.getUserColorSelection());
    }
}
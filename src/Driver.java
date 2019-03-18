import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static Game game = new Game();
    private static int i = 0;

    public static void main(String[] args) {
        startGame();
        // startCliGameLoop();
    }

    private static void startGame() {
        System.out.print("Start game? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine().toUpperCase().charAt(0)) {
            case 'Y':
                System.out.print("Ok... gui or cli? ");
                String s = scanner.nextLine();
                scanner.close();
                if(s.equalsIgnoreCase("gui") || s.contains("gui")) {
                    startGuiGameLoop();
                } else if(s.equalsIgnoreCase("cli") || s.contains("cli")) {
                    startCliGameLoop();
                } else {
                    System.out.println("Invalid, retrying...");
                    startGame(); // java.util.NoSuchElementException
                }
                break;
            case 'N':
                scanner.close();
                System.out.println("Ok, stopping...");
                break;
            default:
                scanner.close();
                System.out.println("Invalid, retrying...");
                startGame();
                break;
        }
    }

    private static void select() {
        Scanner scanner = new Scanner(System.in); // Really bad because of recreation (I think)

        String str = "Enter address of piece you want to move";
        System.out.print((i == 0) ? str + " (Ex: E1, a1, g 2): " : str + ": ");
        i++;
        game.selectPiece(scanner.nextLine());
        if (game.getSelectedPiece().equals("java.lang.NullPointerException")) {
            System.out.println("Invalid space, select again");
            select();
        } else if (!game.canSelectedMove()) {
            System.out.println("You can't move that piece, select again");
            select();
        } else {
            System.out.print("Move " + game.getSelectedPiece().toLowerCase() + " where?: ");
            game.movePiece(scanner.nextLine());
        }
    }

    private static void startGuiGameLoop() {
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI gui = new GUI();
        frame.add(gui);
        frame.setSize(800, 480);
        frame.setVisible(true);
    }

    private static void startCliGameLoop() {
        boolean g = true;
        while (g) {
            System.out.println(game.print());
            select();
            game.incrementTurn();
            game.restartGame();
            g = game.getStatus();
        }
    }
}

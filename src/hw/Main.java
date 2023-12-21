package hw;

public class Main {

    public static void main(String[] args) {

        String reset = "\u001B[0m";
        String dark = "\u001B[30m";

        try {
            Direction red = Direction.RED;
            System.out.print(dark + "\u001B[41m" + red + reset + "(stop)");
            Thread.sleep(1000);

            Direction yellow = Direction.YELLOW;
            System.out.print(dark + "\u001B[43m" + yellow + reset + "(attention)");
            Thread.sleep(1000);

            Direction green = Direction.GREEN;
            System.out.print("\r" + dark + "\u001B[42m" + green + reset + "(move)");


        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
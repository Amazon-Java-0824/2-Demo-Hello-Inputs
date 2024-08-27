import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String name = "Marcus Aurelio";
//        System.out.println("Hello " + name);
//
//        String name2 = "Zeno";
//        System.out.println("Hello " + name2);
//
//
//        System.err.println("This is an error"); // ctrl + d --- to duplicate a line or block
//        A way of asking the user to prompt a name, then greet with the provided name

        Scanner sc = new Scanner(System.in);
//        System.out.println("Please introduce your name:");
//        String inputName = sc.nextLine();
//        System.out.println("Hello " + inputName);
//        System.out.println("Where are you from?");
//        String inputFrom = sc.nextLine();
//        System.out.println("Oh I love " + inputFrom); // to comment I use ctrl + /
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println(age + "!");
//        System.out.println("whats your favorite number?");
//        int favNumber = sc.nextInt();
//        System.out.println("fav number: " + favNumber);
        System.out.println("And you fav color?");
        sc.nextLine(); // this reads the buffer with the remaining "end of the line" so that the next nextLine() will read from the proper line
        String favColor = sc.nextLine();
        System.out.println("nice " + favColor + "!");

//        23/n - nextLine() reads the line till the end from the system in buffer
//        nextInt() reads only the int, the end of the line is not read.
//        so when a nextLine() it's used after a nextInt() it will just read the end of the line. nothing more
//        a solution in this case is do use 2 nextLine() in order to exhaust the buffer from the unconsumed end of line


        sc.close();
    }
}
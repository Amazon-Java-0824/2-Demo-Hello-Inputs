import java.io.*;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class FileInteractions {
    public static void main(String[] args) throws IOException {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello");
//        String input = scanner.nextLine();
//        FileWriter fileWriter = new FileWriter("demo.txt", true);
//        while (!input.equals("exit")) {
//            String message = input;
//            fileWriter.write(ZonedDateTime.now() + " - " + message + "\n");
//            fileWriter.close();
//            input = scanner.nextLine();
//        }

//        FileReader fileReader = new FileReader("demo.txt");
//        1
//        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        bufferedReader.lines().forEach(System.out::println);
//        2
//        int character;
//        while ((character = fileReader.read()) != -1) {
//            System.out.print((char) character);
//        }
//        fileReader.close();
//        3

        Scanner fileScanner = new Scanner(new File("demo.txt"));
        while (fileScanner.hasNextLine()) {
            String nextLine = fileScanner.nextLine()
                    .replace("Salvatore", "Anonymous");
            System.out.println(nextLine);
        }
        fileScanner.close();
    }
}

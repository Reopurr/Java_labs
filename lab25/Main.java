package lab25;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final FileWriter fw;

        try {
            fw = new FileWriter("text.txt");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Can't save file");
            }
        }));


        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                fw.write(scanner.nextLine());
                fw.write('\n');
            }
        } catch (IOException ex) {
            System.out.print("Can't access file");
            throw new RuntimeException(ex);
        }
    }
}


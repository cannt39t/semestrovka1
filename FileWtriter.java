import java.io.*;
import java.util.Random;

public class FileWtriter {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("/Users/ilakaznaceev/Documents/Semestrovka1/Files/File.txt", false))
        {
            // создание файла из 100 строк
            int n = 98;
            Random r = new Random();

            // минимальный набор = 100
            for (int i = 0; i < 100; i++) {
                writer.write(r.nextInt() + " ");
            }
            writer.append('\n');

            // максимальный набор = 10000
            for (int i = 0; i < 10000; i++) {
                writer.write(r.nextInt() + " ");
            }
            writer.append('\n');

            // остальные рандомные

            for (int i = 0; i < n; i++) {
                int amount = (int) ((Math.random()*9900)+100);
                for (int j = 0; j < amount; j++) {
                    writer.write(r.nextInt() + " ");
                }
                writer.append('\n');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
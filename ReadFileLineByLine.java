import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    // построчное считывание файла
    public static void main(String[] args) {
        try {
            File file = new File("/Users/ilakaznaceev/Documents/Semestrovka1/Files/File.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String [] array = line.split(" ");
                int [] intArray = new int [array.length];
                for (int i = 0; i < array.length; i++) {
                    intArray[i] = Integer.parseInt(array[i]);
                }
                double startTime = System.currentTimeMillis();
                int count = shellSort(intArray);
                double endTime = System.currentTimeMillis();
                System.out.println(intArray.length + " " + (int)(endTime-startTime));
                line = reader.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int shellSort(int [] a){
        int n = a.length;
        int count = 0;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if(a[j] > a[j + step]){
                        int x = a[j];
                        a[j] = a[j + step];
                        a[j + step] = x;
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Mynameis {
    public static void main(String[] args) {
        String name = "My name is Belov Nikita";
        addname(name);
    }

    public static void addname(String name){
        try (PrintWriter file = new PrintWriter("name.txt")){
                file.write(name);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e);
        }

    }
}

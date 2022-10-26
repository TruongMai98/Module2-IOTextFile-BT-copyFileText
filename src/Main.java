import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CopyProgram copyProgram = new CopyProgram();
        try {
//            copyProgram.copyFile(copyProgram.readFile("source.txt"));
            copyProgram.copyFileUsingStream("source.txt", "target.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

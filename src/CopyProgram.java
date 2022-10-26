import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyProgram {
    public List<String> readFile(String filePath) throws IOException {
        List<String> strings = new ArrayList<>();
        int ch;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while ((ch = fileReader.read()) != -1) {
            strings.add(String.valueOf((char) ch));
//            System.out.println(ch);
            System.out.println((char) ch);
        }
        fileReader.close();
        return strings;
    }

    public void copyFile(List<String> strings) throws IOException{
        FileWriter fileWriter = new FileWriter("target.txt");
        for (String cg : strings){
            fileWriter.write(cg);
        }
        fileWriter.close();
    }

    public void copyFileUsingStream(String source, String target) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }


}


package CodingTakeHome;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RWFile {

    public static List<String> readInputFile(String path) throws IOException {
        Path filePath = Paths.get(path);
        List<String> stringsLines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        return stringsLines;
    }

    public static void WriteOutputFile(String path,String content) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(content);
        fileWriter.close();
    }
}

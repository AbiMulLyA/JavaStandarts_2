package refactory.java.assignment;

import refactory.java.assignment.model.Model05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Soal5 {
    public static void main(String[] args) throws IOException {
        convertToCsv(filePath());
    }
    public static String filePath(){
        return "src/refactory/java/assignment/items.csv";
    }
    public static void convertToCsv(String path) throws IOException {

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            List<Object> csv = stream
                    .skip(1) // skip headers
                    .map(line -> line.split(","))
                    .map(Soal5::assign)
                    .collect(Collectors.toList());
            generateJson(csv.toString());
//            System.out.println(csv);
        }
    }

    private static Object assign(String[] data) {
        Model05.CsvModel csvModel = new Model05.CsvModel(data[0],
                data[1],
                data[2]);
//        System.out.println(csvModel.toString());
        return csvModel.convertString();
    }

    public static void generateJson(String data){
        try {
            var output = new FileOutputStream("src/refactory/java/assignment/items.json");
            output.write(data.getBytes());
            output.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

package refactory.java.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Soal3 {
    private static String jsonFile = "src/refactory/java/assignment/data03.json";
    public static void main(String[] args ) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
//        try {
//            var inputStream = new FileInputStream("src/refactory/java/assignment/data03.json");
//            System.out.println(new String(inputStream.readAllBytes()));
//            inputStream.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        FileReader reader = new FileReader(jsonFile);
//        System.out.println(reader);
        Object obj = new JSONParser().parse(new FileReader("src/refactory/java/assignment/data03.json"));
        JSONObject jo = (JSONObject) obj;
        long age = (long) jo.get("order_id");
        System.out.println(age);
    }
}

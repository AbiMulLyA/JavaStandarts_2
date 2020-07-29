package refactory.java.assignment;
import java.lang.reflect.Field;
public class Soal2 {
    public static void main(String[] args) {
        printCount("aku");
        printCount("ingin");
        printCount("la...");
    }
    public static void printCount(String text){
        System.out.println(text + " = " + countString(text));
    }
    public static int countString(String text){
        var lyric = "Aku ingin begini\n" +
                "Aku ingin begitu\n" +
                "Ingin ini itu banyak sekali\n\n" +
                "Semua semua semua\n" +
                "Dapat dikabulkan\n" +
                "Dapat dikabulkan\n" +
                "Dengan kantong ajaib\n\n" +
                "Aku ingin terbang bebas\n" +
                "Di angkasa\n" +
                "Hei… baling baling bambu\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali\n" +
                "Doraemon\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali";
        String newLyric = lyric.replace("\n", " ").toLowerCase();
        return newLyric.split(text, -1).length-1;
    }
}

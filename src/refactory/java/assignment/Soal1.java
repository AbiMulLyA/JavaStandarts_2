package refactory.java.assignment;

import java.util.stream.IntStream;

public class Soal1 {
    public static void main(String[] args) {
        status("ibu ratna antar ubi");
        status("ibu ratna anta ubi");
        status("Abi");
        status("kasur rusak");
    }

    public static void status (String text){
        checkPalyndrome(text);
        if(checkPalyndrome(text)) System.out.println(text + " adalah Palyndrome");
        else System.out.println(text + " adalah bukan palyndrome");
    }

    public static boolean checkPalyndrome(String text){
        String temp = text.replace("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length()/2)
                .noneMatch(character -> temp.charAt(character) != temp.charAt(temp.length() - character - 1));
    }

}

package refactory.java.assignment;

import java.util.stream.IntStream;

public class Soal1 {
    public static void main(String[] args) {
        status("ibu ratna antar ubi");
        status("A nut for a jar of tuna.");
        status("Was it a car or a cat I saw?");
        status("Yo, banana boy!");
    }

    public static void status (String text){
        checkPalyndrome(text);
        if(checkPalyndrome(text)) System.out.println(text + " adalah Palyndrome");
        else System.out.println(text + " adalah bukan palyndrome");
    }

    public static boolean checkPalyndrome(String text){
        String temp = text.replaceAll("[^A-Za-z]+", "").toLowerCase();
        return IntStream.range(0, temp.length()/2)
                .noneMatch(character -> temp.charAt(character) != temp.charAt(temp.length() - character - 1));
    }

}

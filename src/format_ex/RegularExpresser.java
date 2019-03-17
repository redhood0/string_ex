package format_ex;

import java.util.Arrays;

public class RegularExpresser {

    public static boolean match(String s){
        return s.matches("\\p{javaUpperCase}.*\\.");
    }
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));

        String sentence = "za is a son of bitch, aha, ahahaa, fuck!";
        System.out.println(Arrays.toString(sentence.split("a")));
        System.out.println(Arrays.toString(sentence.split("a\\W+")));
        System.out.println(sentence.replaceFirst("a\\W+","sb"));
        System.out.println(sentence.replaceAll("son|aha|fuck","good"));

        System.out.println(RegularExpresser.match("Wo shi 123."));


    }
}

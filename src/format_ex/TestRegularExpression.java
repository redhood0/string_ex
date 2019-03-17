package format_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        String sentence = "adkajdlkjajdlal";
        Pattern pattern = Pattern.compile(".*ajd.+");
        Matcher m = pattern.matcher(sentence);
        System.out.println(m);
        //.out.println(m.find());
        //System.out.println(m.matches());
        while (m.find()){
            System.out.println("--" + m.group() + "===" + m.start() + "--" + m.end());
        }
    }
}

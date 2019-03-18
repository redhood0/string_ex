package format_ex;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Pattern class 替换
public class TheReplacements {
    public static void main(String[] args) {
        String s = "Here's a block of next \n the extract matcher \n extrated block.";
        s = s.replaceFirst("[aeiou]","(VOWEL1)");
        System.out.println(s);
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher matcher = p.matcher(s);
        matcher.reset("asdasdasdasfasfsgagasgsafas");
        while(matcher.find()){
            matcher.appendReplacement(sbuf, matcher.group().toUpperCase());
            System.out.println(sbuf);
        }
        matcher.appendTail(sbuf);
        System.out.println(sbuf);
    }
}

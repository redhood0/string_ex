package format_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E10_CheckForMatch {
    //             //b词的边界  //B非词的边界
    public static void main(String[] args) {
        String source = "Java now has regular expressions";
        String[] regEx = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.", "s{0,3}"};
        System.out.println("Source string: " + source);
        for(String patten : regEx){
            Pattern pattern = Pattern.compile(patten);
            Matcher matcher = pattern.matcher(source);
            while(matcher.find()){
                System.out.println(matcher.group() + "--" + matcher.start() + "--" + matcher.end());
            }
        }
    }
}

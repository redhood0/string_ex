package format_ex;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * threat 威胁 analyzer 分析
 * 用正则表达式扫描
 */
public class ThreatAnalyzer  {
    static String threatData =
            "58.12.32.123@02/10/2005\n" +
                    "58.12.32.123@02/10/2005\n" +
                    "58.12.32.123@02/10/2005\n" +
                    "58.12.32.123@02/10/2005\n" +
                    "58.12.32.123@02/10/2005\n" +
                    "58.12.32.123@02/10/2005\n" +
                    "58.12.32.123@02/10/2005\n" +
                    "[Next log section with differen data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@"+
                "(\\d{2}/\\d{2}/\\d{4})";
        while(scanner.hasNext(pattern)){

            System.out.println(scanner.next(pattern));
            MatchResult matchResult = scanner.match();
            String ip = matchResult.group(1);
            String date = matchResult.group(2);
            System.out.printf("Threat on %s from %s\n",date,ip);
        }
    }
}

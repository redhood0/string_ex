package format_ex;

public class Rudolph {
    public static void main(String[] args) {
        for(String pattern : new String[]{ "Rudolph",
        "[Rr]udolph","[rR][aeiou][a-z]ol.*","R.*"}){
            System.out.println("Rudolph".matches(pattern));
        }
    }
}

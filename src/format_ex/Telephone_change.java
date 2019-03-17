package format_ex;

public class Telephone_change {
    public static void main(String[] args) {
        String tel = "sb-15906288612";
        String result = tel.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1****$3");
        System.out.println(result);
    }
}

package format_ex;

import java.util.Formatter;

public class TestFormat {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-20s  %5s  %10s\n", "Item", "Qty", "Price");
        f.format("%-20s  %5s  %10s\n", "---", "---", "----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-20s  %5s  %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotalPrice() {
        f.format("%-20s  %-5s  %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-20s  %-5s  %10s\n", "", "", "---");
        f.format("%-20s  %-5s  %10.2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args){
        TestFormat testFormat = new TestFormat();
        testFormat.printTitle();
        testFormat.print("Jack's magic beans", 4, 4.25);
        testFormat.print("Princess peas", 3, 3.1);
        testFormat.print("LUCK", 2, 5);
        testFormat.printTotalPrice();

    }


}
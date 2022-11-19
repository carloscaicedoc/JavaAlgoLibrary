public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        String test1 = printer.printerError("aaabbbbhaijjjm");
        String test2 = printer.printerError("aaaxbbbbyyhwawiwjjjwwm");
        String test3 = printer.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz");
        String test4 = printer.printerErrorReplace("mariposa");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }    
}

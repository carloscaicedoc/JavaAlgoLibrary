public class Test {
    public static void main(String[] args) {
        Bio bio = new Bio();
        
        System.out.println(bio.dnaToRna("GCAU"));
        System.out.println(bio.dnaToRna("UUUU"));

        System.out.println(bio.dnaToRnaReplace("GCAU"));
        System.out.println(bio.dnaToRnaReplace("UUUU"));
        
        System.out.println(bio.dnaToRnaCharArray("GCAU"));
        System.out.println(bio.dnaToRnaCharArray("UUUU"));

        System.out.println(bio.dnaToRna4("GUAU"));
        System.out.println(bio.dnaToRna4("UUUU"));
    }
}

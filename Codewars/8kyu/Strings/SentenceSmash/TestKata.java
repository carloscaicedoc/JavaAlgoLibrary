public class TestKata {
    public static void main(String[] args) {
        SmashWords smasher = new SmashWords();
        
        String[] wordList = {"hello", "world", "this", "is", "great"};
        System.out.println(smasher.smash(wordList));
        System.out.println(smasher.smashJoin(wordList));
        System.out.println(smasher.smashStringBuilder(wordList));
        System.out.println(smasher.smashTrim(wordList));
        System.out.println(smasher.smashStream(wordList));
    }
}
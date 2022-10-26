public class Test {
    public static void main(String[] args) {
        Banjo banjo = new Banjo();
        String player = "Roland";
        System.out.println(banjo.areYouPlayingBanjo(player));
        System.out.println(banjo.areYouPlayingBanjoTO(player));
        System.out.println(banjo.areYouPlayingBanjoSubstring(player));
        System.out.println(banjo.areYouPlayingBanjoFormat(player));
    }
}

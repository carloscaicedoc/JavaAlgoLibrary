/* CodeWars 8kyu Are You Playing Banjo 

Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
The function takes a name as its only argument, and returns one of the following strings:
name + " plays banjo" 
name + " does not play banjo"
*/

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return (name.charAt(0) == 'R' || name.charAt(0) == 'r')
                ? name + " plays banjo"
                : name + " does not play banjo";
    }

    // Ternary Operator .startsWith("R")
    public static String areYouPlayingBanjoTO(String name) {
        return (name.toUpperCase().startsWith("R")) ? name + " plays banjo" : name + " does not play banjo";
    }

    // SubString approach
    public static String areYouPlayingBanjoSubstring(String name) {
        return name.substring(0, 1).toLowerCase().equals("r") ? name + " plays banjo" : name + " does not play banjo";
    }

    // Format
    public static String areYouPlayingBanjoFormat(String name) {
        return String.format("%s %s banjo", name, name.toLowerCase().startsWith("r") ? "plays" : "does not play");
    }
}
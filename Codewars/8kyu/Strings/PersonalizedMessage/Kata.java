/* Codewars 8kyu Grasshopper - Personalized Message

Create a function that gives a personalized greeting. 
This function takes two parameters: name and owner.
Use conditionals to return the proper message:

case : name equals owner - return 'Hello boss'
case : otherwise         - return 'Hello guest'
*/

public class Kata {
    // .equals method for String comparison
    public String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    public String greet2(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
}

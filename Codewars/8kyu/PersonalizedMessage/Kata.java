
public class Kata {

    public String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
    public String greet2(String name, String owner) {

        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }

}

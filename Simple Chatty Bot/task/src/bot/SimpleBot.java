package bot;

public class SimpleBot {
    private boolean isActive;
    private String name;
    private int yearOfBirth;

    SimpleBot(String name) {
        this.name = name;
        this.isActive = true;
        this.yearOfBirth = 2018;
    }

    private void runBot() {
        System.out.println("Hello! My name is " + name + ".");
        System.out.println("I was created in " + yearOfBirth + ".");
        isActive = false;
    }

    public static void main(String[] args) {
        SimpleBot simpleBot = new SimpleBot("Aid");
        while (simpleBot.isActive) {
            simpleBot.runBot();
        }
    }
}

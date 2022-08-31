package se.nackademin;

/**
 * Hello world!
 *
 */
public class App {
    public int value = 8;

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        App app = new App();
        app.doSomething();
    }

    public void doSomething() {
        if (true) {
            if (value > 8) {
                if (value == 8) {
                    System.out.println("Hello World!! 8");
                }
            }
        }
    }

    public void setValue(int value) {
        this.value = value;
    }
}

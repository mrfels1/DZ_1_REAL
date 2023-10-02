public class Main {
    public static void main(String[] args) {

        System.out.println("----- Dog Class Testing -----");
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob"); d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        // Ball Testing
        System.out.println("\n----- Ball Class Testing -----");

        Ball ball1 = new Ball("Red", 5.0);
        Ball ball2 = new Ball("Blue", 3.5);

        System.out.println(ball1);
        System.out.println(ball2);

        ball1.setColor("Green");
        ball2.setRadius(4.0);

        System.out.println("Updated information:");
        System.out.println(ball1);
        System.out.println(ball2);

        System.out.println("Volume of ball1: " + ball1.calculateVolume());
        System.out.println("Volume of ball2: " + ball2.calculateVolume());


        // Book Testing
        System.out.println("\n----- Book Class Testing -----");

        Book book1 = new Book("Java Programming", "John Doe", 400);
        Book book2 = new Book("Python for Beginners", "Jane Smith", 250);

        System.out.println(book1);
        System.out.println(book2);

        book1.setTitle("Advanced Java Programming");
        book2.setAuthor("John Smith");
        book2.setPages(300);

        System.out.println("Updated information:");
        System.out.println(book1);
        System.out.println(book2);
    }
}
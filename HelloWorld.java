public class HelloWorld {
    public static void main(String[] args) {

<<<<<<< HEAD
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
=======
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello " + name);
>>>>>>> 5b3b45e61829c16987dded9d4622b342c9bd86bb

        String names = "";

        for (String name : args) {
            names += name + ", ";
        }

        names = names.substring(0, names.length() - 2);

        System.out.println("Hello, " + names + "!");
    }
}
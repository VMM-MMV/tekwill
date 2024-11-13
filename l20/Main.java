public class Main {
    public static void main(String[] args) throws UserNotFoundException {
        System.out.println("\nhello");
        example2();
    }

    public static void example1() {
        try {
            System.out.println(2 / 0);
            userExists("Mihai");
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Error happened");
        }
    }

    public static void example2() throws UserNotFoundException {
        System.out.println(2 / 0);
        userExists("Mihai");
    }

    public static boolean userExists(String user) throws UserNotFoundException {
        if (user != null) {
            return true;
        } else {
            throw new UserNotFoundException(user + " could not be found!");
        }
    }
}
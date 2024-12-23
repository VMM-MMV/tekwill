public class CustomSingleton {
    private static volatile CustomSingleton instance;

    private static int nrOfUsers;

    public static synchronized CustomSingleton getInstance() {
        if (instance == null) {
            instance = new CustomSingleton();
        }
        return instance;
    }

    private CustomSingleton () {}

    public static void setNrOfUsers(int users) {
        nrOfUsers = users;
    }

    public static int getNrOfUsers() {
        return nrOfUsers;
    }
}

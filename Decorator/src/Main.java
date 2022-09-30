public class Main {
    public static void main(String[] args) {
        var superUser = new ModeratorRoleDecorator(new AdminRoleDecorator(new UserRole()));
        System.out.println("User can do:");
        for (var action : superUser.getActions())
        {
            System.out.println(action);
        }

    }
}
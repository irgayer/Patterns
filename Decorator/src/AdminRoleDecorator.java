import java.util.ArrayList;

public class AdminRoleDecorator extends RoleDecorator {
    public AdminRoleDecorator(IRole role) {
        super(role);
    }

    @Override
    public ArrayList<String> getActions() {
        var s = super.getActions();
        s.add("Ban user from chat;");

        return s;
    }
}

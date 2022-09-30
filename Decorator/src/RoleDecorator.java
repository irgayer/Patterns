import java.util.ArrayList;

public class RoleDecorator implements IRole {
    private IRole role;

    public RoleDecorator(IRole role)
    {
        this.role = role;
    }

    @Override
    public ArrayList<String> getActions() {
        return role.getActions();
    }
}

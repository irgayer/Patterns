import java.util.ArrayList;

public class ModeratorRoleDecorator extends RoleDecorator{
    public ModeratorRoleDecorator(IRole role) {
        super(role);
    }

    @Override
    public ArrayList<String> getActions() {
        var s = super.getActions();
        s.add("Mute users; Delete messages;");
        return s;
    }
}

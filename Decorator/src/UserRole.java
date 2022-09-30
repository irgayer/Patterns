import java.util.ArrayList;

public class UserRole implements IRole {
    protected ArrayList<String> actions = new ArrayList<>();

    public UserRole() {
        this.actions.add("Read messages; Write message;");
    }

    @Override
    public ArrayList<String> getActions() {
        return actions;
    }
}

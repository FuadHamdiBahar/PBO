package groupadder.database;

import java.util.ArrayList;

public class Database {
    private static Database database;
    private final ArrayList<Group> groups = new ArrayList<>();

    private Database() {
        for (int i = 0; i < 4; i++) {
            groups.add(new Group(String.format("Group %d", i+1)));
        }
    }
    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }
    public ArrayList<Group> getGroups() {
        return groups;

    }
    public Group getGroup(String groupName) {
        String[] splitString = groupName.split(" ");
        return groups.get(Integer.parseInt(splitString[1])-1);
    }
}

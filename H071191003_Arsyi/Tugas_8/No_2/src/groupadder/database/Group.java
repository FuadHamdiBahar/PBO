package groupadder.database;

import java.util.ArrayList;

public class Group {
    private final ArrayList<Member> members = new ArrayList<>();
    private final String groupName;

    public Group(String groupName){
        this.groupName = groupName;
    }
    public void addMember(String name, String studentId, String gender) {
        members.add(new Member(name, studentId, gender));
    }
    public Member getMember(int index) {
        return members.get(index);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }


    @Override
    public String toString() {
        return groupName;
    }
}

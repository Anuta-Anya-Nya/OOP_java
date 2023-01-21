package data;

import java.util.List;

public class GroupStream{
    private List<StudentGroup> studentGroupList;
    private int streamNumber;
    
    public GroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }
    
    @Override
    public String toString() {
        return "Групп в потоке: "+ studentGroupList.size();
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }
    public int getSize() {
        return studentGroupList.size();
    }
    public int getStreamNumber() {
        return streamNumber;
    }
}

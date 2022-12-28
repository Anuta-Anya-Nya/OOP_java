package data;

import java.util.Iterator;
import java.util.List;

import data.iterators.GroupStreamIterator;

public class GroupStream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroupList;
    private int streamNumber;
    
    public GroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }
    
    @Override
    public Iterator<StudentGroup> iterator() {
       return new GroupStreamIterator(this);
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

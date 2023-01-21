package data.iterators;

import java.util.Iterator;
import java.util.List;

import data.GroupStream;
import data.StudentGroup;

public class GroupStreamIterable extends GroupStream implements Iterable<StudentGroup>{

    public GroupStreamIterable(List<StudentGroup> studentGroupList) {
        super(studentGroupList);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
       return new GroupStreamIterator(this);
    }
    
    
}

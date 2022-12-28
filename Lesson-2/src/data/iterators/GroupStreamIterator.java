package data.iterators;

import java.util.Iterator;

import data.GroupStream;
import data.StudentGroup;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private GroupStream groupStream;
    private Iterator<StudentGroup> groups; 
    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
    }

    @Override
    public boolean hasNext() {
        return this.groups.hasNext();
    }

    @Override
    public StudentGroup next() {
        return this.groups.next();
    }

    public GroupStream getGroupStream() {
        return groupStream;
    }
    
}

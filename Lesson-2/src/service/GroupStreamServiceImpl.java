package service;

import java.util.Collections;
import java.util.List;

import data.GroupStream;
import data.GroupStreamComparator;

public class GroupStreamServiceImpl implements DataServiceStream{

    @Override
    public GroupStream readStream(int groupNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void createStream(int groupNumber) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sortStream(List<GroupStream> groupStreamCollection) {
        Collections.sort(groupStreamCollection, new GroupStreamComparator());
    }
    
}

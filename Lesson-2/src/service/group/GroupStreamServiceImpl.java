package service.group;

import data.GroupStream;
import data.comparators.GroupStreamComparator;

import java.util.List;
import java.util.Collections;

public class GroupStreamServiceImpl implements GroupStreamService {
    
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}

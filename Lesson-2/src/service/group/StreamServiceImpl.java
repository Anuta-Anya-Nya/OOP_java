package service.group;

import java.util.Collections;
import java.util.List;

import data.GroupStream;
import data.comparators.GroupStreamComparator;
import repository.Repository;

public class StreamServiceImpl implements StreamService{
    private final Repository<GroupStream, Integer> StreamRepository;

    public StreamServiceImpl(Repository<GroupStream, Integer> streamRepository) {
        StreamRepository = streamRepository;
    }

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

    public void saveGroup(GroupStream stream){ 
        StreamRepository.save(stream);
        
    }
    public GroupStream findGroup(Integer number) {
        return StreamRepository.findById(number);
    }

}

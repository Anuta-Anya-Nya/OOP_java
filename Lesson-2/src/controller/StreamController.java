package controller;

import java.util.List;

import data.GroupStream;
import service.group.StreamService;

public class StreamController implements Controller<GroupStream, Integer>{
    private final StreamService streamService;

    public StreamController(StreamService streamService) {
        this.streamService = streamService;
    }

    @Override
    public void create(GroupStream entity) {
        int streamNumber = entity.getStreamNumber();
        streamService.createStream(streamNumber);
        
    }

    @Override
    public void save(GroupStream entity) {
        streamService.saveGroup(entity);        
    }

    @Override
    public GroupStream findById(Integer id) {
        return streamService.findGroup(id);
    }
    public void sortStream(List<GroupStream> streams){
        streamService.sortStream(streams);
    }

}

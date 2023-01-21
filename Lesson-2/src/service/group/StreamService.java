package service.group;

import java.util.List;

import data.GroupStream;

public interface StreamService {
    GroupStream readStream(int groupNumber);

    void createStream(int groupNumber);

    void sortStream(List<GroupStream> groupStream);

    void saveGroup(GroupStream stream);

    GroupStream findGroup(Integer number);
}

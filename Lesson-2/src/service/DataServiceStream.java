package service;

import java.util.List;

import data.GroupStream;

public interface DataServiceStream {
    GroupStream readStream(int groupNumber);
    void createStream(int groupNumber);
    void sortStream(List<GroupStream> groupStream);
}

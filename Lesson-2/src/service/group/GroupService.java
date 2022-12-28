package service.group;

import data.StudentGroup;

public interface GroupService {
    StudentGroup readGroup(int groupNumber);
    void createGroup(int groupNumber);
}

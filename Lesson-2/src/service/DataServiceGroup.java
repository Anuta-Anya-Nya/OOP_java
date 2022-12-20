package service;

import data.StudentGroup;

public interface DataServiceGroup {
    StudentGroup readGroup(int groupNumber);
    void createGroup(int groupNumber);
}

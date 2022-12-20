package service;

import data.StudentGroup;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentGroupServiceImpl implements DataServiceGroup {

    @Override
    public StudentGroup readGroup(int groupNumber) {
        return ReaderFromTxt.readGroup(groupNumber);       
    }

    @Override
    public void createGroup(int groupNumber) {
        WriterToTxt.writeGroup(new StudentGroup(groupNumber));
    }
    
}

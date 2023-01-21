package service.group;

import java.util.Collections;
import java.util.Iterator;

import data.StudentGroup;
import data.comparators.StudentComparable;
import data.iterators.StudentGroupIterable;
import repository.Repository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class GroupServiceImpl implements GroupService<StudentGroupIterable, Integer> {

    private StudentGroupIterable studentGroup;
    private final Repository<StudentGroupIterable, Integer> studentGroupIntegerRepository;

    public GroupServiceImpl(Repository<StudentGroupIterable, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    @Override
    public StudentGroupIterable readGroup(Integer groupNumber) {
        return ReaderFromTxt.readGroup(groupNumber);
    }

    @Override
    public void createGroup(Integer groupNumber) {
        WriterToTxt.writeGroup(new StudentGroup(groupNumber));
    }

    @Override
    public void removeStudent(String fio) {
        Iterator<StudentComparable> iterator = getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFio().equals(fio)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void sortStudent(StudentGroupIterable studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

    @Override
    public StudentGroupIterable saveGroup(StudentGroupIterable group) { // можно сделать void
        return studentGroupIntegerRepository.save(group);
    }

    @Override
    public StudentGroupIterable findGroup(Integer number) {
        return studentGroupIntegerRepository.findById(number);
    }

    public Repository<StudentGroupIterable, Integer> getStudentGroupIntegerRepository() {
        return studentGroupIntegerRepository;
    }

    public StudentGroupIterable getStudentGroup() {
        return studentGroup;
    }

}

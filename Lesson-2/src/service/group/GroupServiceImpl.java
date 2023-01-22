package service.group;

import java.util.Collections;

import data.StudentGroup;
import data.iterators.StudentGroupIterable;
import repository.GroupRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class GroupServiceImpl implements GroupService<StudentGroup, Integer> {

    private final GroupRepository studentGroupRepository;

    public GroupServiceImpl(GroupRepository studentGroupRepository) {
        this.studentGroupRepository = studentGroupRepository;
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
        studentGroupRepository.removeStudent(fio);
        // Iterator<StudentComparable> iterator = studentGroup.iterator();
        // while (iterator.hasNext()) {
        // if (iterator.next().getFio().equals(fio)) {
        // iterator.remove();
        // }
        // }
    }

    @Override
    public StudentGroup saveGroup(StudentGroup group) { // можно сделать void
        return studentGroupRepository.save(group);
    }

    @Override
    public StudentGroup findGroup(Integer number) {
        return studentGroupRepository.findById(number);
    }

    @Override
    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

}

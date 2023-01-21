package service.group;

public interface GroupService<U, I> {
    U readGroup(I groupNumber);

    void createGroup(I groupNumber);

    void removeStudent(String fio);

    void sortStudent(U studentGroup);

    U saveGroup(U group);

    U findGroup(I number);


}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import data.GroupStream;
import data.StudentGroup;
import data.comparators.GroupStreamComparator;
import data.comparators.StudentComparable;
import data.comparators.UserComparator;



public class App {
    public static void main(String[] args){
        List<StudentComparable> userList1 = Arrays.asList(new StudentComparable("Yasha", 20, 5555, 1)
                                                , new StudentComparable("Anton", 18, 333,1)
                                                , new StudentComparable("Viktor", 26, 4444, 1));
        System.out.println(userList1);
        Collections.sort(userList1, new UserComparator());
        System.out.println(userList1);

        StudentGroup studentGroup1 = new StudentGroup(userList1, 1); 

        List<StudentComparable> userList2 = Arrays.asList(new StudentComparable("Misha", 24, 5555, 2)
                                                , new StudentComparable("Nikolai", 19, 333,2)); 
        StudentGroup studentGroup2 = new StudentGroup(userList2, 2);

        List<StudentComparable> userList3 = Arrays.asList(new StudentComparable("Alex", 24, 5555, 3));
        StudentGroup studentGroup3 = new StudentGroup(userList3, 3);

        List<StudentGroup> studentGroupsList1= Arrays.asList(studentGroup1, studentGroup2);
        List<StudentGroup> studentGroupsList2= Arrays.asList(studentGroup3);

        List<GroupStream> groupStreams = Arrays.asList(new GroupStream(studentGroupsList1), new GroupStream(studentGroupsList2), new GroupStream(studentGroupsList2));
        System.out.println(groupStreams);
        Collections.sort(groupStreams, new GroupStreamComparator());
        System.out.println(groupStreams);
        
    }
}

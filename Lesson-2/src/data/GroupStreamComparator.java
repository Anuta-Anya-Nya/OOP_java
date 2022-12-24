package data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        var size1 = o1.getStudentGroupList().size();
        var size2 = o2.getStudentGroupList().size();

        if (size1 < size2)//по убыванию
            return 1;
        if (size1 > size2)
            return -1;
        return 0;
    }

}

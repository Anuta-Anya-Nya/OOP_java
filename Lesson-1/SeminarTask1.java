import java.util.ArrayList;
import java.util.List;

public class SeminarTask1 {
    public static void main(String[] args) {
        VendingMachine m1 = new VendingMachine();
        VendingMachine m2 = new VendingMachine();
        LittleVendingMachine lm1 = new LittleVendingMachine();
        List<VendingMachine> list = new ArrayList<>();
        list.add(lm1);
        list.add(m1);
        list.add(m2);
        for (VendingMachine i : list) {
            i.restore();
        }
    }
}

import java.util.Comparator;

public class SortByDeposit implements Comparator<DataSet> {

    @Override
    public int compare(DataSet o1, DataSet o2) {
        return o1.getDeposit()-o2.getDeposit();
    }
}

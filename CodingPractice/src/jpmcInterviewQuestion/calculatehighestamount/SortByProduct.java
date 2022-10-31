import java.util.Comparator;

public class SortByProduct implements Comparator<DataSet> {

    @Override
    public int compare(DataSet o1, DataSet o2) {
        return o1.getProduct().compareTo(o2.getProduct());
    }
}

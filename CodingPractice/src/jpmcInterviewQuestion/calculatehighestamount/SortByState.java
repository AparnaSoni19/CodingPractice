import java.util.Comparator;

public class SortByState implements Comparator<DataSet> {

    @Override
    public int compare(DataSet o1, DataSet o2) {
        return o1.getState().compareTo(o2.getState());
    }
}

import java.util.Comparator;

public class DataSet  {
    private String state;
    private String product;
    private int deposit;

    public DataSet(String state, String product, int deposit) {
        this.state = state;
        this.product = product;
        this.deposit = deposit;
    }

    public String getState() {
        return state;
    }

    public String getProduct() {
        return product;
    }

    public int getDeposit() {
        return deposit;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "state='" + state + '\'' +
                ", product='" + product + '\'' +
                ", deposit=" + deposit +
                '}';
    }
}

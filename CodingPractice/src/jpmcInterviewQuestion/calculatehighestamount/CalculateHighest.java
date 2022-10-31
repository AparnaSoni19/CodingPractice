import java.util.*;
import java.util.stream.Collectors;

public class CalculateHighest {
    public static void main(String[] args) {
        DataSet dataSet1 = new DataSet("CA" , "CD" ,100000);
        DataSet dataSet2 = new DataSet("TX" , "Check" ,100000);
        DataSet dataSet3 = new DataSet("WA" , "Check" ,400000);
        DataSet dataSet4 = new DataSet("TX" , "CD" ,300000);
        DataSet dataSet5 = new DataSet("WA" , "Sav" ,500000);
        DataSet dataSet6 = new DataSet("WA" , "CD" ,200000);
        DataSet dataSet7 = new DataSet("CA" , "Check" ,300000);
        DataSet dataSet8 = new DataSet("TX" , "Sav" ,200000);
        DataSet dataSet9 = new DataSet("CA" , "Sav" ,800000);
        List<DataSet> listOfDataSet = new ArrayList<>();
        listOfDataSet.add(dataSet1);
        listOfDataSet.add(dataSet2);
        listOfDataSet.add(dataSet3);
        listOfDataSet.add(dataSet4);
        listOfDataSet.add(dataSet5);
        listOfDataSet.add(dataSet6);
        listOfDataSet.add(dataSet7);
        listOfDataSet.add(dataSet8);
        listOfDataSet.add(dataSet9);
        listOfDataSet.stream()
                .collect(Collectors.groupingBy
                        (DataSet::getProduct,Collectors.maxBy(new SortByDeposit())))
                .forEach((s, dataSet) -> System.out.println(dataSet));


    }
}

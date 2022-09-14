package array;

public class Array {
    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[15];
        DVD avengersDVD = new DVD("The Avengers","Description", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", "Description",2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", "Description",2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", "Description",2019, "Jon Favreau");
        DVD starWarsDVD = new DVD("Star Wars","Description", 1977, "George Lucas");
        dvdCollection[7] =avengersDVD;
        dvdCollection[3] =incrediblesDVD;
        dvdCollection[9] =findingDoryDVD;
        dvdCollection[2] =lionKingDVD;
        dvdCollection[3] =starWarsDVD;
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[3]);
        System.out.println(dvdCollection[9]);
        System.out.println(dvdCollection[2]);
        System.out.println(dvdCollection[1]);

        int arrayOfSquareNumbers[] = new int[10];
        for(int i =0;i<10 ;i++)
        {
            int squareNumbers = (i+1) * (i+1);
            arrayOfSquareNumbers[i]= squareNumbers;
        }

        for(int i =0;i<10 ;i++)
        {
            System.out.println(arrayOfSquareNumbers[i]);
        }
        System.out.println("For Each Loops:");
        for(int square :arrayOfSquareNumbers)
        {
            System.out.println(square);
        }

        //array length
        System.out.println("array.Array Length is"+arrayOfSquareNumbers.length);

    }

}

package numberispoweroftwo;

public class CheckWhetherNumberIsAPowerOf2OrNot {
    public static void main(String[] args) {
        int number = 64;
        CheckWhetherNumberIsAPowerOf2OrNot checkWhetherNumberIsAPowerOf2OrNot = new CheckWhetherNumberIsAPowerOf2OrNot();
        boolean powerOfTwo = checkWhetherNumberIsAPowerOf2OrNot.checkWhetherNumberIsAPowerOf2OrNot(number);
        if (powerOfTwo) {
            System.out.println(number+" Number Is A Power Of 2");
        } else {
            System.out.println(number+" Number Is Not A Power Of 2");
        }

    }

    private boolean checkWhetherNumberIsAPowerOf2OrNot(int number) {
        if (number <= 1) {
            return false;
        } else {
            while (number != 1) {
                if (number % 2 != 0) {
                    return false;
                }
                number = number / 2;
            }
            return true;
        }
    }
}

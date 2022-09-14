package checkoverloading;

public class CheckOverLoading {
    public static void main(String[] args) {
        CheckOverLoading checkOverLoading = new CheckOverLoading();
        checkOverLoading.method(null);
    }

    private void method(Object o) {
        System.out.println("Object");
    }
    private void method(String s) {
        System.out.println("String");
    }
}

package throwvsthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowVSTr{
    public static void main(String[] args) {
        ThrowVSTr throwVSTr = new ThrowVSTr();
        throwVSTr.method();
    }

    private void method() {
        try {
            FileReader file = new FileReader("C:\\test\\a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

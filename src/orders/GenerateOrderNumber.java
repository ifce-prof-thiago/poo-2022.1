package orders;

import java.security.SecureRandom;

public class GenerateOrderNumber {

    static String generate() {
        return generateLetter() + generateLetter() + generateLetter() + " " + generateNumber();
    }

    private static String generateLetter() {
        return ((char) (new SecureRandom().nextInt(26) + 65)) + "";
    }

    private static String generateNumber() {
        return "%04d".formatted((new SecureRandom().nextInt(10000)));
    }

}

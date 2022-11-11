package testAutoFramework.utils;

import java.math.BigInteger;

import static io.github.qsy7.logging.util.ExceptionUtil.random;

public class RandomValuesGenerator {
    public final String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final String smallChars = "abcdefghijklmnopqrstuvwxyz";
    public final String numbers = "0123456789";
    public final String symbols = "!@#$%^&*()_+<>?";

    public static String randomString;
    public static long randomLong;

    public static String getRandomString() {
        randomString = new BigInteger(130, random).toString(12);
        return randomString;
    }

    public static long getRandomInt() {
        randomLong = new BigInteger(3, random).longValue();
        return randomLong;
    }

}

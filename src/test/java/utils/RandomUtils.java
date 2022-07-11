package utils;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static String randomSubject() {

        String[] subj = {"English", "German", "Biology", "Hindi", "Chemistry", "Civics", "Maths"};
        String random = (subj[new Random().nextInt(subj.length)]);
        return random;
    }

    public static String randomHobby() {

        String[] hobby = {"Sports", "Reading", "Music"};
        String random = (hobby[new Random().nextInt(hobby.length)]);
        return random;
    }

    public static String randomGender() {

        String[] gender = {"Other", "Male", "Female"};
        String random = (gender[new Random().nextInt(gender.length)]);
        return random;
    }

    public static LocalDate genRandomDate() {
        LocalDate startInclusive = LocalDate.of(1900, Month.JANUARY, 1);
        LocalDate endExclusive = LocalDate.now();
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}

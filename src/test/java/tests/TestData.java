package tests;

import com.github.javafaker.Faker;
import utils.RandomUtils;

import javax.xml.crypto.Data;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestData {
    Faker faker = new Faker();



    String firstName = faker.address().firstName(),
            lastName = faker.address().lastName(),
            email = faker.internet().emailAddress(),
            gender = RandomUtils.randomGender(),
            phone = String.valueOf(faker.number().randomNumber(10, true)),
            Month =String.valueOf(RandomUtils.genRandomDate().getMonth()),
            birthMonth = Character.toUpperCase(Month.charAt(0)) + Month.substring(1).toLowerCase(),
            birthYear = String.valueOf(RandomUtils.genRandomDate().getYear()),
            birthDay = String.valueOf(RandomUtils.genRandomDate().getDayOfMonth()),
            subject = RandomUtils.randomSubject(),
            hobby = RandomUtils.randomHobby(),
            picture = "image.jpg",
            address = faker.address().fullAddress(),
            state = "Uttar Pradesh",
            city = "Lucknow";

}

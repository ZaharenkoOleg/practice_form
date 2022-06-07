package tests;

import com.github.javafaker.Faker;
import utils.RandomUtils;

public class TestData {
    Faker faker = new Faker();

    String firstName = faker.address().firstName(),
            lastName = faker.address().lastName(),
            email = faker.internet().emailAddress(),
            gender = RandomUtils.randomGender(),
            phone = String.valueOf(faker.number().randomNumber(10, true)),
            birthMonth = RandomUtils.randomMonth(),
            birthYear = "2000",
            birthDay = "04",
            subject = RandomUtils.randomSubject(),
            hobby = RandomUtils.randomHobby(),
            picture = "image.jpg",
            address = faker.address().fullAddress(),
            state = "Uttar Pradesh",
            city = "Lucknow";


}

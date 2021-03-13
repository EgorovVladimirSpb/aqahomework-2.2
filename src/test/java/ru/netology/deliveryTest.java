package ru.netology;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class deliveryTest {

    @Test
    void ShouldSendFormWithValidData() {
        open("http://localhost:9999");
        $("[class='input__control'][type='text'][placeholder=\"Город\"]").setValue("Санкт-Петербург");
        $("[type='date']").setValue("20.03.2021");
//
//        $("[name='phone']").setValue("+792000000000");
//        $$("button").find(exactText("Продолжить")).click();
//        $(withText("Успешная авторизация")).shouldBe(visible, Duration.ofSeconds(5));
//        $(byText("Личный кабинет")).shouldBe(visible, Duration.ofSeconds(5));
    }
}

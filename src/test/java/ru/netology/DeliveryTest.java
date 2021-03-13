package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class DeliveryTest {

    LocalDate today = LocalDate.now();
    LocalDate newDate = today.plusDays(3);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @BeforeEach
    void Setup() {
        open("http://localhost:9999");
    }

    @Test
    void ShouldSendFormWithValidData() {
        $("[placeholder='Город']").setValue("Санкт-Петербург");
        $("[placeholder='Дата встречи']").doubleClick().sendKeys(formatter.format(newDate));
        $("[name='name']").setValue("Егоров Владимир");
        $("[name='phone']").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("[class=button__text]").click();
        $(withText("Успешно!")).waitUntil(visible,(15000));
    }
}

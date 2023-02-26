package pro.sky.kutin.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String initPage() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String infoPage() {
        return "<p>Алексей Кутин</p>" +
                "<p>Приложение для сайта рецептов</p>" +
                "<p>Дата создания: 26.02.2023</p>" +
                "<p>Проект написан на языке Java с использованием фреймворка Spring</p>";
    }
}

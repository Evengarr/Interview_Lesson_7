/**
 * 1. Создать сущность Student с полями id, name, age.
 * 2. Сконфигурировать Spring Data.
 * 3. Создать репозиторий для вставки, удаления, изменения и просмотра студентов.
 * 4. Создать контроллер с методами, которые вызывают методы репозитория.
 * 5. Создать Thymeleaf-шаблон, на которой в таблице отобразить список студентов с кнопками для добавления, обновления и удаления записей.
 * 6. Привязать к каждой кнопке действие, которое будет передаваться на контроллер.
 */
package ru.geekbrains.interview_lesson_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LessonApp {

    public static void main(String[] args) {
        SpringApplication.run(LessonApp.class, args);
    }

}

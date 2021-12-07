package ru.geekbrains.interview_lesson_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.interview_lesson_7.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

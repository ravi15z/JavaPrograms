package com.programs.javaprograms.stud_exam;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    int studId;
    String studName;
    List<Exam> exams;
}

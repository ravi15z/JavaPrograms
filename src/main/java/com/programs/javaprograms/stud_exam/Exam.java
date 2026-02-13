package com.programs.javaprograms.stud_exam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {

    int examId;
    String examName;
    double marks;
}

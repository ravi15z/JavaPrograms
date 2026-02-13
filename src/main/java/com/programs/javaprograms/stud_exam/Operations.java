package com.programs.javaprograms.stud_exam;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

public class Operations {

        public static void main(String[] args) {
                List<Student> students = addStudentData();

                System.out.println(students);

                System.out.println("Subject name: hindi -> names and marks");
                sub_mark(students);
                // Operation 1: find the student who has the highest mark in a given subject.
        }

        private static void sub_mark(List<Student> students) {
                students.stream()
                                .flatMap(stud -> stud.getExams().stream()
                                                .filter(e -> e.getExamName().equalsIgnoreCase("hindi"))
                                                .map(e -> new AbstractMap.SimpleEntry<>(stud, e.getMarks())))
                                .forEach(e -> System.out.println(e.getKey().getStudName() + " : " + e.getValue()));
        }

        private static List<Student> addStudentData() {
                return Arrays.asList(
                                new Student(5, "abc",
                                                Arrays.asList(new Exam(11, "marathi", 65.00),
                                                                new Exam(11, "Hindi", 75.00),
                                                                new Exam(11, "English", 68.00))),
                                new Student(2, "qwe",
                                                Arrays.asList(new Exam(33, "marathi", 55.00),
                                                                new Exam(11, "Hindi", 67.00),
                                                                new Exam(11, "English", 78.00))),
                                new Student(1, "xyz",
                                                Arrays.asList(new Exam(22, "marathi", 88.00),
                                                                new Exam(11, "Hindi", 55.00),
                                                                new Exam(11, "English", 73.00))),
                                new Student(4, "rtx",
                                                Arrays.asList(new Exam(44, "marathi", 90.00),
                                                                new Exam(11, "Hindi", 45.00),
                                                                new Exam(11, "English", 58.00))));
        }
}

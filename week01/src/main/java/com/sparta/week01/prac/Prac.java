package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        Course course = new Course();
        course.title = "웹개발의 봄, Spring";
        System.out.println(course.title);
        System.out.println(course.tutor);

        Course course2 = new Course();
        course2.title = "프론트엔드의 꽃 React";
        course2.tutor = "임민영";
    }
}


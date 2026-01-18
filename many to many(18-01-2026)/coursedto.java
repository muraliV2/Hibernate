package com.hibernate.dto;

import java.util.List;

import com.hibernate.dao.course;
import com.hibernate.dao.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class coursedto 
{
static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
static EntityManager manager = factory.createEntityManager();
static EntityTransaction transaction = manager.getTransaction();
public static void insertdata(int courseId,String courseName,String courseduration)
{
course c = new course();


c.setCourseId(courseId);
c.setCourseName(courseName);
c.setCourseduration(courseduration);


transaction.begin();
manager.persist(c);
transaction.commit();


}

public static void mapStudentCourse(int studentId, int courseId) {

    student s = manager.find(student.class, studentId);
    course c = manager.find(course.class, courseId);

    if (s == null || c == null) {
        System.out.println("Mapping failed");
        return;
    }

    c.getStudent().add(s);
    s.getCourse().add(c);

    transaction.begin();
    transaction.commit();
}

}

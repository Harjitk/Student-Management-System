import db.DBHelper;
import models.Course;
import models.Level;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        Course course1 = new Course("Social Sciences", Level.BA );
        DBHelper.saveOrUpdate(course1);
        Course course2 = new Course("Engineering", Level.BENG);
        DBHelper.saveOrUpdate(course2);
        Course course3 = new Course("Biology", Level.BSC);
        DBHelper.saveOrUpdate(course3);

        Student student1 = new Student("Harjit", "Singh", 28, 19890704, course1);
        DBHelper.saveOrUpdate(student1);
        Student student2 = new Student("Angelina", "Blyth", 27, 19900606, course2);
        DBHelper.saveOrUpdate(student2);
        Student student3 = new Student("Steven", "Bonner", 29, 19880605, course3);
        DBHelper.saveOrUpdate(student3);


        DBHelper.delete(student1);
    }
}

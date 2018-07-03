package models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    private int id;
    private String title;
    private Level level;
    List<Student> students;

    public Course() {
    }

    public Course(String title, Level level) {
        this.title = title;
        this.level = level;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }


    public void setId(int id){
        this.id = id;

}

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Enumerated(value = EnumType.STRING)
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
//
//// Change Course so that it has a List<Student> students property.
//In Course add OneToMany association to students property.
//This should have attribute of fetch = FetchType.LAZY and be mapped to course property of the Student class.
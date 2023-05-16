package HW;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> students;
    private Student headman;
    private List<String> tasks;

    public StudentGroup(Student headman) {
        this.headman = headman;
        students=new ArrayList<>();
        students.add(headman);
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void changeHeadman(Student student) {
        headman = student;
    }

    public void renameStudent(Student student, String newName) {
        student.setName(newName);
    }

    public void addTask(String task) {
        tasks.add(task);
        students.stream().forEach(x->x.addTask(task));
    }
    public void setTaskDone(Student student,String task){
        student.setTaskDone(task);
    }
}

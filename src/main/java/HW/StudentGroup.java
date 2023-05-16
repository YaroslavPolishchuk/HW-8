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

    // Remove a student from the group
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Change the headman of the group
    public void changeHeadman(Student student) {
        headman = student;
    }

    // Rename a student in the group
    public void renameStudent(Student student, String newName) {
        student.setName(newName);
    }

    // Add a task for all students in the group
    public void addTask(String task) {
        tasks.add(task);
        students.stream().forEach(x->x.addTask(task));
    }
    public void setTaskDone(Student student,String task){
        student.setTaskDone(task);
    }
}

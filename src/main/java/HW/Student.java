package HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Student {
    private int id;
    private String name;
    private String surname;
    private Map<String,status> tasks;
    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tasks=new HashMap<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void addTask(String task) {
        tasks.put(task,status.Not_ready);
    }
    public void setTaskDone(String task){
        tasks.entrySet()
                .stream()
                .filter(x->x.getKey()==task)
                .forEach(e->e.setValue(status.Completed));
    }
    enum status {
        Not_ready,
        Completed;

    }
}

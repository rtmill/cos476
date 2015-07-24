package foo.bar;

import org.springframework.stereotype.Component;

/**
 * Created by motech on 7/24/15.
 */
@Component
public class Student {
    public String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

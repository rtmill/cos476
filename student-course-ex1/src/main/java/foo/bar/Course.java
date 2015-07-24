package foo.bar;

import org.springframework.stereotype.Component;

/**
 * Created by motech on 7/24/15.
 */
@Component
public class Course {
    public String subject;
    public int courseNum;

    public Course() {
    }

    public Course(String subj, int courseNum) {
        this.subject = subj;
        this.courseNum = courseNum;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNum=" + courseNum +
                ", subject='" + subject + '\'' +
                '}';
    }
}

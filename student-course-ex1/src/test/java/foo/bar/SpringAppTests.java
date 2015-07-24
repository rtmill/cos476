package foo.bar;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {
    @Autowired
    private HelloService helloService;

    @Autowired
    private Student student;

    @Autowired
    private Course course;

    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello world!", helloService.sayHello());
    }

    @Test
    public void printStudent(){
        System.out.println(student.toString());

        Student matt = new Student("Matt");
        System.out.println(matt.toString());
    }

    @Test
    public void printCourse(){
        System.out.println(course.toString());

        Course c1 = new Course("COS", 160);
        System.out.println(c1.toString());

    }

}

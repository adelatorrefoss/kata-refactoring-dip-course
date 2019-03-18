package course;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class CourseTest {

    @Test
    public void xxx() throws InterruptedException {
        Course course = new Course("First");
        course.start();
        TimeUnit.SECONDS.sleep(3);
        course.end();
        assertTrue(course.isShort());
    }
}

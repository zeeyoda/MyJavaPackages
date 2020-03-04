package day44;

public class CourseCreator {
    public static void main(String[] args) {

        System.out.println("Course.counter = "+Course.counter);
        Course c1 = new Course("Jave", "foundation");
        Course c2 = new Course("Selenium", "automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Webservice");
        Course c5 = new Course("Agile", "Soft Skills");
        Course c6 = new Course(null, null);
        Person p7 = new Person("Ziyoda", 37);
        System.out.println("Course.counter "+Course.counter);

    }
}

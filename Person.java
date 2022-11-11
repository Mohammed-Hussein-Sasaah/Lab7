/*9. Implement a superclass Person. Make two classes, Student and Instructor, that
inherit from Person. A person has a name and a year of birth. A student has a
major, and an instructor has a salary. Write the class declarations, the
constructors, and the methods toString for all classes. Supply a test program
for these classes and methods.*/


class Person {
    String name;
    int year;
    Person(String _ame, int year) {

        name = name;

        year = year;

    }

    @Override

    public String toString() {

        return "{" + " name='" + name + "'" + ", year='" + year + "'" + "}";

    }

}

class Student extends Person {
    String major;

    Student(String name, int year, String major) {

        super(name, year);

        major = major;

    }

    @Override

    public String toString() {

        return "{" + " name='" + name + "'" + ", year='" + year + "'" + " major='" + major + "'" + "}";

    }
}


class Instructor extends Person {

    double salary;

    Instructor(String name, int year, double salary) {

        super(name, year);

        salary = salary;

    }


    @Override

    public String toString() {

        return "{" + " name='" + name + "'" + ", year='" + year + "'" + " salary='" + salary + "'" + "}";

    }

}


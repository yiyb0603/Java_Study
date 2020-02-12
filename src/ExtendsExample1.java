class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Person(String name, int age, int height, int weight) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

class Student extends Person {
    private String studentID;
    private int grade;
    private double GPA;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public Student(String name, int age, int height, int weight, String studentID, int grade, double GPA) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GPA;
    }

    public void show() {
        System.out.println(".................");
        System.out.println("학생 이름: " + getName());
        System.out.println("학생 나이: " + getAge());
        System.out.println("학생 키: " + getHeight());
        System.out.println("학생 몸무게: " + getWeight());
        System.out.println("학번: " + getStudentID());
        System.out.println("학년: " + getGrade());
        System.out.println("학점: " + getGPA());
    }
}

class Teacher extends Person {
    private String teacherID;
    private int monthSalary;
    private int workedYear;

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setWorkedYear(int workedYear) {
        this.workedYear = workedYear;
    }

    public int getWorkedYear() {
        return workedYear;
    }

    public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.monthSalary = monthSalary;
        this.workedYear = workedYear;
    }

    public void show() {
        System.out.println("...................");
        System.out.println("교사 이름: " + getName());
        System.out.println("교사 나이: " + getAge());
        System.out.println("교사 키: " + getHeight());
        System.out.println("교사 몸무게: " + getWeight());
        System.out.println("교직원 번호: " + getTeacherID());
        System.out.println("교사 월급: " + getMonthSalary());
        System.out.println("교사 연차: " + getWorkedYear());
    }
}

public class ExtendsExample1 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20, 175, 70, "2020/02/12", 1, 4.5);
        Student student2 = new Student("권용빈", 18, 170, 70, "2020/02/12", 2, 4.7);
        Student student3 = new Student("김주엽", 18, 1800, 75, "2020/02/12", 3, 4.9);

        student1.show();
        student2.show();
        student3.show();

        Teacher teacher1 = new Teacher("이순동", 60, 175, 70, "2020/02/12", 500, 1);
        Teacher teacher2 = new Teacher("신희송", 30, 180, 67, "2020/02/12", 500, 1);
        Teacher teacher3 = new Teacher("권태현", 35, 180, 70, "2020/02/12", 500, 1);

        teacher1.show();
        teacher2.show();
        teacher3.show();
    }
}

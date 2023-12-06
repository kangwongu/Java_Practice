package class1;

public class Student {
    String name;
    int age;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름: " + name + " 나이: " + age + " 성적: " + score;
    }
}

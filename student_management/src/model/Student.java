package model;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private Long studentId;
    private String studentCode;
    private String studentName;
    private int age;
    private int gender;
    private String address;
    private Classes classStudent;
    private String image;
    private Set<Objects> objects = new HashSet<>();
    private boolean statusStudent;

    private Set<Role> roles = new HashSet<>();

    public Student() {
    }

    public Student(Long studentId, String studentCode, String studentName, int age, int gender, String address, Classes classStudent, String image, boolean statusStudent, Set<Role> roles, Set<Objects> objects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.classStudent = classStudent;
        this.image = image;
        this.statusStudent = statusStudent;
        this.roles = roles;
        this.objects = objects;
        this.studentCode = studentCode;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classes getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(Classes classStudent) {
        this.classStudent = classStudent;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatusStudent() {
        return statusStudent;
    }

    public void setStatusStudent(boolean statusStudent) {
        this.statusStudent = statusStudent;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Objects> getObjects() {
        return objects;
    }

    public void setObjects(Set<Objects> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentCode='" + studentCode + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", classStudent=" + classStudent +
                ", image='" + image + '\'' +
                ", objects=" + objects +
                ", statusStudent=" + statusStudent +
                ", roles=" + roles +
                '}';
    }
}

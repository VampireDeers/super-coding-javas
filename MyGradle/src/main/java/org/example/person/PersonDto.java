package org.example.person;

public class PersonDto {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String gender;
    private String nationality;
    private String education;

    public PersonDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", address='" + address + '\'' +
               ", email='" + email + '\'' +
               ", phone='" + phone + '\'' +
               ", gender='" + gender + '\'' +
               ", nationality='" + nationality + '\'' +
               ", education='" + education + '\'' +
               '}';
    }
}
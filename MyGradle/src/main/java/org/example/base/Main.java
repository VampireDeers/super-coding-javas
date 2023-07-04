package org.example.base;

import org.example.person.Person;
import org.example.person.PersonDto;

public class Main {
    public static void main(String[] args) {
        // PersonDto to Person
        PersonDto personDto = new PersonDto();
        personDto.setName("John Doe");
        personDto.setAge(30);
        personDto.setAddress("123 Street, City");
        personDto.setEmail("john.doe@example.com");
        personDto.setPhone("123-456-7890");
        personDto.setGender("Male");
        personDto.setNationality("American");
        personDto.setEducation("Bachelor's Degree");

        System.out.println(personDto);

        Person person = new Person();
        person.setFullName(personDto.getName());
        person.setYears(personDto.getAge());
        System.out.println(person);
    }
}
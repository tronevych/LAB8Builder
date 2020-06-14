/*
 *
 * Programming patterns. Factory, Builder.
 *
 * 13 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 4
 *
 *Develop for your class
 *1. Factory.
 *2. Abstract factory.
 *3. Create a class Student  - 25 fields.
 *4. Create a builder for the class Student/
 *
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        // Rectangle Factory

        Rectangle rectangle1 = RectangleFactory.create(5,5);
        System.out.println(rectangle1);

        // Abstract Rectangle Factory

        Rectangle pr1 = AbstractFactoryRectangle.create(10,10);
        System.out.println(pr1);

        // Student

        Student student;
        student = new Student("Tronevych",
                "Serhii",
                "Oleksandrovich",
                "Gamaliy",
                "Volodymyr",
                "Fedorovych",
                "Volodymyrets",
                Speciality.DIGITAL_ECONOMY,
                false,
                5,
                false,
                false,
                false,
                true,
                false,
                false,
                true,
                true,
                Gender.MALE,
                "ukrainian",
                2015,
                2020,
                76,
                183,
                21);

        System.out.println(student);

        // Student Zashko Mikhaylo

        Student Mikhaylo = new Student.Builder()
                .setFirstName("Mikhaylo")
                .setLastName("Zashko")
                .setPatronymic("Volodymyrovych")
                .setFirstNameCurator("Ivanova")
                .setLastNameCurator("Oxana")
                .setPatronymicCurator("Mikolaivna")
                .setBirthplace("Rivne")
                .setSpeciality(Speciality.LAW)
                .setExemption(true)
                .setCourse(6)
                .setBudgetForm(true)
                .setExternalForm(false)
                .setFitForMilitary(false)
                .setSportsCategory(true)
                .setInvalidity(false)
                .setSevereDiseases(false)
                .setAdult(true)
                .setBedPlace(false)
                .setGender(Gender.MALE)
                .setNationality("ukrainian")
                .setYearOfEntry(2014)
                .setGraduationYear(2020)
                .setHeight(176)
                .setWeight(90)
                .setAge(23)
                .build();

        System.out.println(Mikhaylo);

        // Student Oleg is similar to Artem except the  Name, Curator and speciality.


        Student Oleg = new Student.Builder()
                .setSimilarTo(Mikhaylo)
                .setFirstName("Andrii")
                .setLastName("Vishnivetskii")
                .setFirstNameCurator("Bogdan")
                .setLastNameCurator("Tarasyuk")
                .setSpeciality(Speciality.CYBERNETICS)
                .build();

        System.out.println(Oleg);


    }

}

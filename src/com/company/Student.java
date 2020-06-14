/*
 *
 * Programming patterns. Factory, Builder.
 *
 *  13 June 2020
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

public class Student {

    // 1 firstName String, set the student First name
    private String firstName;
    // 2 lastName String, set the student Last name
    private String lastName;
    // 3 patronymic String, set the student patronymic
    private String patronymic;
    // 4 firstNameCurator String, set the First name of student curator
    private String firstNameCurator;
    // 5 lastNameCurator String, set the Last name of student curator
    private String lastNameCurator;
    // 6 patronymicCurator String, set the patronymic of student curator
    private String patronymicCurator;
    // 7 birthplace String, set the student birthplace
    private String birthplace;
    // 8 speciality enum Speciality, set the student speciality
    // enum Speciality: DESIGN, SOFTWARE_ENGINEERING, NETWORKS, GUI
    private Speciality speciality;
    // 9 exemption boolean, set the availability of exemption
    private boolean exemption;
    // 10 course int, set the student course
    private int course;
    // 11 fitForMilitary boolean, set checking fit For Military
    private boolean fitForMilitary;
    // 12 budgetForm boolean, set the availability of budgetForm
    private boolean budgetForm;
    // 13 externalForm boolean, set checking form of education
    private boolean externalForm ;
    // 14 Invalidity boolean, set checking the invalidity
    private boolean invalidity;
    // 15 severeDiseases boolean, set checking the invalidity
    private boolean severeDiseases;
    // 16sportsCategory boolean, set checking sports Category
    private boolean sportsCategory;
    // 17 adult boolean, set checking the adult
    private boolean adult;
    // 18 bedPlace boolean, set checking the bed Place
    private boolean bedPlace;
    // 19 gender enum Gender, set the student gender
    // enum Gender: MALE, FEMALE
    private Gender gender;
    // 20 nationality String, set the student nationality
    private String nationality;
    // 21 yearOfEntry int, set the student year Of Entry
    private int yearOfEntry;
    // 22 graduationYear int, set the student graduation Year
    private int graduationYear;
    // 23 weigth int, set the student weigth
    private int weight;
    // 24 heigth int, set the student heigth
    private int height;
    // 25 age int, set the student age
    private int age;

    // Class constructor with parameters

    public Student(String firstName,
                   String lastName,
                   String patronymic,
                   String firstNameCurator,
                   String lastNameCurator,
                   String patronymicCurator,
                   String birthplace,
                   Speciality speciality,
                   boolean exemption,
                   int course,
                   boolean budgetForm,
                   boolean externalForm,
                   boolean fitForMilitary,
                   boolean sportsCategory,
                   boolean invalidity,
                   boolean severeDiseases,
                   boolean adult,
                   boolean bedPlace,
                   Gender gender,
                   String nationality,
                   int yearOfEntry,
                   int graduationYear,
                   int weight,
                   int height,
                   int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.firstNameCurator = firstNameCurator;
        this.lastNameCurator = lastNameCurator;
        this.patronymicCurator = patronymicCurator;
        this.birthplace = birthplace;
        this.speciality = speciality;
        this.exemption = exemption;
        this.course = course;
        this.budgetForm = budgetForm;
        this.externalForm = externalForm;
        this.fitForMilitary = fitForMilitary;
        this.sportsCategory = sportsCategory;
        this.invalidity = invalidity;
        this.severeDiseases = severeDiseases;
        this.adult = adult;
        this.bedPlace = bedPlace;
        this.gender = gender;
        this.nationality = nationality;
        this.yearOfEntry = yearOfEntry;
        this.graduationYear = graduationYear;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    // empty constructor

    public Student() {
    }

    /**
     * Getter for field Student firstName
     * @return Returns first name of object Student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for field Student firstName
     * @param firstName sets first name of object Student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    //  getters and setters for next value

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstNameCurator() {
        return firstNameCurator;
    }

    public void setFirstNameCurator(String firstNameCurator) {
        this.firstNameCurator = firstNameCurator;
    }

    public String getLastNameCurator() {
        return lastNameCurator;
    }

    public void setLastNameCurator(String lastNameCurator) {
        this.lastNameCurator = lastNameCurator;
    }

    public String getPatronymicCurator() {
        return patronymicCurator;
    }

    public void setPatronymicCurator(String patronymicCurator) {
        this.patronymicCurator = patronymicCurator;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public boolean isExemption() {
        return exemption;
    }

    public void setExemption(boolean exemption) {
        this.exemption = exemption;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isBudgetForm() {
        return budgetForm;
    }

    public void setBudgetForm(boolean budgetForm) {
        this.budgetForm = budgetForm;
    }

    public boolean isExternalForm() {
        return externalForm;
    }

    public void setExternalForm(boolean externalForm) {
        this.externalForm = externalForm;
    }

    public boolean isFitForMilitary() {
        return fitForMilitary;
    }

    public void setFitForMilitary(boolean fitForMilitary) {
        this.fitForMilitary = fitForMilitary;
    }

    public boolean isSportsCategory() {
        return sportsCategory;
    }

    public void setSportsCategory(boolean sportsCategory) {
        this.sportsCategory = sportsCategory;
    }

    public boolean isInvalidity() {
        return invalidity;
    }

    public void setInvalidity(boolean invalidity) {
        this.invalidity = invalidity;
    }

    public boolean isSevereDiseases() {
        return severeDiseases;
    }

    public void setSevereDiseases(boolean severeDiseases) {
        this.severeDiseases = severeDiseases;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public boolean isBedPlace() {
        return bedPlace;
    }

    public void setBedPlace(boolean bedPlace) {
        this.bedPlace = bedPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int yearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method toString() for class Student

    @Override
    public String toString() {
        return "Student{" +
                "First Name - '" + firstName + '\'' + "\n" +
                "Last Name - '" + lastName + '\'' + "\n" +
                "Patronymic - '" + patronymic + '\'' + "\n" +
                "First name curator - '" + firstNameCurator + '\'' + "\n" +
                "Last name curator - '" + lastNameCurator + '\'' + "\n" +
                "Patronymic curator - '" + patronymicCurator + '\'' + "\n" +
                "Birthplace - '" + birthplace + '\'' + "\n" +
                "Speciality - " + speciality + "\n" +
                "Exemption - " + exemption + "\n" +
                "Course - " + course + "\n" +
                "BudgetForm - " + budgetForm + "\n" +
                "External Form - " + externalForm + "\n" +
                "Fit For Military - " + fitForMilitary + "\n" +
                "Sports Category - " + sportsCategory + "\n" +
                "Invalidity - " + invalidity + "\n" +
                "SevereDiseases - " + severeDiseases + "\n" +
                "Adult  - " + adult + "\n" +
                "Bed Place - " + bedPlace + "\n" +
                "Gender - " + gender + "\n" +
                "Nationality - '" + nationality + '\'' + "\n" +
                "Year Of Entry - '" + yearOfEntry + '\'' + "\n" +
                "Graduation Year - '" + graduationYear + '\'' + "\n" +
                "Weight - " + weight + "\n" +
                "Height - " + height + "\n" +
                "Age - " + age +
                '}';
    }


    // Pattern Builder take basic Student with all setters for StudentToBuild

    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }


        // Method setSimilarTo complements new object example
        // StudentToBuild with the first example in basis
        // @param student is an object from which all parameters are taken

        public Builder setSimilarTo(Student student){
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.firstNameCurator = student.firstNameCurator;
            this.studentToBuild.lastNameCurator = student.lastNameCurator;
            this.studentToBuild.patronymicCurator = student.patronymicCurator;
            this.studentToBuild.birthplace = student.birthplace;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.exemption = student.exemption;
            this.studentToBuild.course = student.course;
            this.studentToBuild.budgetForm = student.budgetForm;
            this.studentToBuild.externalForm = student.externalForm;
            this.studentToBuild.fitForMilitary = student.fitForMilitary;
            this.studentToBuild.sportsCategory = student.sportsCategory;
            this.studentToBuild.invalidity = student.invalidity;
            this.studentToBuild.severeDiseases = student.severeDiseases;
            this.studentToBuild.adult = student.adult;
            this.studentToBuild.bedPlace = student.bedPlace;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.nationality = student.nationality;
            this.studentToBuild.yearOfEntry = student.yearOfEntry;
            this.studentToBuild.graduationYear = student.graduationYear;
            this.studentToBuild.weight = student.weight;
            this.studentToBuild.height = student.height;
            this.studentToBuild.age = student.age;
            return this;
        }


        // Setter for StudentToBuild of Student object firstName field
        // @param firstName Sets first name of StudentToBuild object

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
        // the same situation for all 24 fields with each own parameters

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setFirstNameCurator(String firstNameCurator){
            studentToBuild.setFirstNameCurator(firstNameCurator);
            return this;
        }

        public Builder setLastNameCurator(String lastNameCurator){
            studentToBuild.setLastNameCurator(lastNameCurator);
            return this;
        }

        public Builder setPatronymicCurator(String patronymicCurator){
            studentToBuild.setPatronymicCurator(patronymicCurator);
            return this;
        }

        public Builder setBirthplace(String birthplace){
            studentToBuild.setBirthplace(birthplace);
            return this;
        }

        public Builder setSpeciality(Speciality speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setExemption(boolean exemption){
            studentToBuild.setExemption(exemption);
            return this;
        }

        public Builder setCourse(int course){
            studentToBuild.setCourse(course);
            return this;
        }

        public Builder setBudgetForm(boolean budgetForm){
            studentToBuild.setBudgetForm(budgetForm);
            return this;
        }

        public Builder setExternalForm(boolean externalForm){
            studentToBuild.setExternalForm(externalForm);
            return this;
        }

        public Builder setFitForMilitary(boolean fitForMilitary){
            studentToBuild.setFitForMilitary(fitForMilitary);
            return this;
        }

        public Builder setSportsCategory(boolean sportsCategory){
            studentToBuild.setSportsCategory(sportsCategory);
            return this;
        }

        public Builder setInvalidity(boolean invalidity){
            studentToBuild.setInvalidity(invalidity);
            return this;
        }

        public Builder setSevereDiseases(boolean severeDiseases){
            studentToBuild.setSevereDiseases(severeDiseases);
            return this;
        }

        public Builder setAdult(boolean adult){
            studentToBuild.setAdult(adult);
            return this;
        }

        public Builder setBedPlace(boolean bedPlace){
            studentToBuild.setBedPlace(bedPlace);
            return this;
        }

        public Builder setGender(Gender gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setYearOfEntry(int yearOfEntry){
            studentToBuild.setYearOfEntry(yearOfEntry);
            return this;
        }

        public Builder setGraduationYear(int graduationYear){
            studentToBuild.setGraduationYear(graduationYear);
            return this;
        }

        public Builder setWeight(int weight){
            studentToBuild.setWeight(weight);
            return this;
        }

        public Builder setHeight(int height){
            studentToBuild.setHeight(height);
            return this;
        }

        public Builder setAge(int age){
            studentToBuild.setAge(age);
            return this;
        }

        // Method returns a built Student object with all parameters
        public Student build(){
            return studentToBuild;
        }

    }

}
public class Person {
    private String name;
    private String surname;
    private String occupation;
    private Gender gender;
    private int year;

    public Person(String name, String surname, String occupation, Gender gender, int year){
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.gender = gender;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nSurname: " + surname + "\nOccupation: " + occupation 
        + "\nGender: " + gender + "\nYear: " + year;
    }
}

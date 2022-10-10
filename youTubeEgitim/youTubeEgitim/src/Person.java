public class Person extends Customer{
    public String Nationality;
    public String FirstName;
    public String LastName;

    public String getNationality() {
        return Nationality;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;


    }
}

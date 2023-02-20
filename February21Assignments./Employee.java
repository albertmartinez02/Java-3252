// Jonpier Veliz and Albert Martinez
// Create a general Employee superclass that has common attributes 

public abstract class Employee {
    private final String firstName; 
    private final String lastName; 
    private final String socialSecurityNumber; 

    // Constructor 
    public Employee (String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.socialSecurityNumber = socialSecurityNumber; 
    }

    // Return first name 
    public String getFirstName() { return firstName; }

    // Return last name
    public String getLastName() { return lastName; }

    // Return social security number
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    // Return String representation of Employee object 
    @Override
    public String toString() {
        return String.format("%s %s%n social security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber()); 
    }
    
}

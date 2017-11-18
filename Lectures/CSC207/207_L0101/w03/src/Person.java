public class Person {

	// For Student to have access to these:
	// - change these to package private
	// - protected: all subclasses have access to it
	// - use getters and setters
	
	// public, private, protected, package-private
	
    /** This Person's name. */
    protected String[] name;
    
    /** This Person's date of birth in format DDMMYYYY.     */
    private String dob;    
    
    /** This Person's gender. */
    private String gender; // getting rid of "private" here makes it package private
    

    /**
     * Creates a Person named name with date of birth dob
     * and gender gender.
     * 
     * @param name the name of this Person
     * @param dob the date of birth (DDMMYYYY) of this Person
     * @param gender the gender of this Person (either M or F)
     */
    public Person(String[] name, String dob, String gender) {
        this.name = name.clone();
        this.dob = dob;
        this.gender = gender;
    }
    
    /**
     * Returns the date of birth of this Person.
     * @return the date of birth (format DDMMYYYY)
     */
    public String getDob() {
        return this.dob;
    }
    
    /**
     * Sets the date of birth of this Person to dob.
     * @param dob the new date of birth (format DDMMYYYY)
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Returns the name of this Person.
     * @return the name of this Person
     */
    public String[] getName() {
    	return name.clone();
    }

    /**
     * Sets the name of this Person to name.
     * @param name the new name of this Person
     */
    public void setName(String[] name) {
    	this.name = name;
    }

    /**
     * Returns the gender of this person.
     * @return the gender of this person (M or F)
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of this person to gender.
     * @param gender the gender of this person (M or F)
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** 
     * Returns a string representation of this person.
     */
    @Override
    public String toString() {
        String result = "PRINTING PERSON: ";
        
        for (String n : this.name) {
            result = result + n + " ";
        }

        result += this.dob;
        
        if (this.gender.equals("M")) {
            result += ", male";
        } else {
            result += ", female";
        }
        
        return result;
    }
    
}
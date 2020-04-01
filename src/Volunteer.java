class Volunteer extends Employee{
    // instance variable:
    int hours;

    /** Parameterized Constructor
     * 	@param name The volunteer's name. **/
    Volunteer(String name){
        // explicit call to superclass' parameterized constructor
        super(name);
    }

    /** @param Set the hours instance variable. **/
    void setHours(int hours){
        this.hours = hours;
    }

    /** @return The hours instance variable **/
    int getHours(){
        return hours;
    }

    @Override
    /** Overrides the superclass' print method and prints information about an instance of Volunteer. **/
    void print(){
        System.out.println("Volunteer Name: " + this.getName()
                + "\nHours: " + this.getHours());
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Erica");
        employee.print();
        employee.setSalary(60000);
        employee.print();

        Volunteer volunteer = new Volunteer("Anna");
        volunteer.setHours(20);
        volunteer.print();
        System.out.println("volunteers don't have salary");
    }
}
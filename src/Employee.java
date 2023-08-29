public class Employee {

    private String name;
    private String surname;
    private String address;


    Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.address = newEmployeeAddress;
        this.surname = newEmployeeSurname;

    }


    public String getEmployeeDetails() {
        return name + "\n" + surname + "\n" + address;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return this.surname;
    }




}



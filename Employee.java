public class Employee {
         String name;
         String surName;
         String address;


        public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
                this.name = newEmployeeName;
                this.surName = newEmployeeSurname;
                this.address = newEmployeeAddress;
        }

        public String getEmployeeDetails(){
                 return "name is " + name + " and the surnanme is " + surName + " and the address is " + address;
        }
}

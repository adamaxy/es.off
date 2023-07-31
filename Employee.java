public class Employee {
        static String name;
        static String surName;
        static String address;


        public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
                this.name = newEmployeeName;
                this.surName = newEmployeeSurname;
                this.address = newEmployeeAddress;
        }

        public String getEmployeeDetails(){
                 return "name is " + name + " and the surnanme is " + surName + " and the address is " + address;
        }

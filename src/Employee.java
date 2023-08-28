public class Employee {

    private String name;
    private String surname;
    private String address;
    public boolean employeeThatNeedsBadge;

    Employee(String name, String surname, String address, boolean employeeThatNeedsBadge) {
        this.name = name;
        this.address = address;
        this.surname = surname;

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

    public String getBadgeId(BadgeIssuer badgeIssuer){
        return badgeIssuer.getBadgeId();


} public String getBadgeBulider (BadgeIssuer badgeIssuer){
        return badgeIssuer.getBadgeId();
    }


}
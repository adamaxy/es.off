import java.awt.desktop.ScreenSleepEvent;
import java.util.Random;

public class BadgeTester {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;
private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
Random random = new Random();

public char createRandom(){
        int randomInt = Math.abs(random.nextInt());
        randomInt = 'a' + (randomInt % ('z' - 'a' + 1));
        char mychar = (char) randomInt;
        return  mychar;
    }

public String randomString(int lenghtNumber){
        String mioID = "";
        for(int i = 0; i < lenghtNumber; i++){
            mioID += createRandom();
        }
        return mioID;
    }
private String generateBadgeIdCode(){
        return randomString(3) + Employee.name + Employee.surName + randomString(3);
    }
public void showBadgeDetails() {
        keepTrackOfEmployeesNumber();
        System.out.println("Total number of employees tracked by badges: " + totalNumberOfEmployees);
        System.out.println("Employee Details:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }
public Badge(Employee employeeThatNeedsBadge){
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();

    }
}
        String randomCode1 = generateRandomString(3);
        String randomCode2 = generateRandomString(3);
        return randomCode1 + employee.name + employee.surname + randomCode2;
    }
public void showBadgeDetails() {
        System.out.println("Numero totale di dipendenti tracciati dai badge: " + totalNumberOfEmployees);
        System.out.println("Dettagli dipendente:\n" + employee.getEmployeeDetails());
        System.out.println("Codice Badge: " + badgeIdCode);
    }

private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString.toString();
    }


public Badge(Employee employeeThatNeedsBadge) {
        employee = employeeThatNeedsBadge;
        keepTrackOfEmployeesNumber();
        badgeIdCode = generateBadgeIdCode();
    }
}

public class BadgeTester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("mario", "rossi", "via lopez 2g");
        Employee employee2 = new Employee("giorgia", "verdi", "Piazza Italia 7");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        System.out.println("Dettagli Badge Dipendente 1:");
        badge1.showBadgeDetails();

        System.out.println("\nDettagli Badge Dipendente 2:");
        badge2.showBadgeDetails();
    }
}

import java.util.Random;

public class Badge {
    private static int totalNumbersOfEmployee;
    private String badgeIdCode;
    public Employee employee;

    Badge(int totalNumbersOfEmployee, String badgeIdCode, Employee employee) {
        this.badgeIdCode = badgeIdCode;
        this.employee = employee;
    }

    public String getBadgeIdCode(){
        return this.badgeIdCode;
    }

    private static void keepTrackOfEmployeesNumber() {
        totalNumbersOfEmployee++;
    }

    private String generateRandomCode(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomCode = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomCode.append(characters.charAt(index));


        } return randomCode.toString();
    }


    public String generaBadgeIdCode (){
        String randomCode1 = generateRandomCode(3);
        String randomCode2 = generateRandomCode(3);
        String badgeIdCode = randomCode1 + employee.getName() + employee.getSurname() + randomCode2;

        return badgeIdCode;
    }

    public void showBadgeDetails(){
        System.out.println("numero badge attivi: " + totalNumbersOfEmployee);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
    }
}
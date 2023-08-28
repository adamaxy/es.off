import java.util.UUID;

public class BadgeIssuer {

    private static Employee employeeThatNeedsBadge;
    private String badgeIdCode;

    public BadgeIssuer(Employee employee){
        this.employeeThatNeedsBadge = generateEmployeeThatNeedsBadge();
        this.badgeIdCode = getGenerateBadgeCode();

    }
    private Employee generateEmployeeThatNeedsBadge() {
        return new Employee("marco","rossi","via roma 23",true);
    }
    private String getGenerateBadgeCode(){
      return UUID.randomUUID().toString();
    }
    public String getBadgeId(){
        return getGenerateBadgeCode();
    }
   // public String getBadgeGenerator(){ return generateBadgeCode();}


}

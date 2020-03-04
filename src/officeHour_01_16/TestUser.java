package officeHour_01_16;

public class TestUser {
    int a;
    public static void main(String[] args) {
        TestUser t1 = new TestUser();


        UserInfo person1 = new UserInfo();
        person1.setUserName("Abduvohid");
        System.out.println(person1.getUserName());

        person1.setSsn("12546325");
        System.out.println(person1.getSsn());

        UserInfo person2 = new UserInfo();
        person2.setUserName("Hadisahon");




    }
}

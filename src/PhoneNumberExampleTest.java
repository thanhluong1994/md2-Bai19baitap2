public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validEmail = new String[] { "84-0984765326","82-0984765345" };
    public static final String[] invalidEmail = new String[] { "4a-023465326","6b-3454765326" };

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberExample();
        for (String Phone : validEmail) {
            boolean isvalid = phoneNumberExample.validate(Phone);
            System.out.println("So dien thoai: " + Phone + " " + isvalid);
        }
        for (String Phone : invalidEmail) {
            boolean isvalid = phoneNumberExample.validate(Phone);
            System.out.println("So dien thoai: " + Phone + " " + isvalid );
        }
    }
}
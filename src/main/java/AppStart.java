public class AppStart {

    public static void main(String[] args) {
        StringBuffer info = new StringBuffer();
        info.append(System.lineSeparator());
        info.append("My phone number is: ");
        info.append(PhoneNumberInfo.number);
        info.append(System.lineSeparator());
        info.append("My operator is: ");
        info.append(PhoneNumberInfo.operator);
        info.append(System.lineSeparator());
        info.append("My tariff is: ");
        info.append(PhoneNumberInfo.tariff);
        System.out.println(info);
    }
}

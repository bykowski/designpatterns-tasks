public class AppStart {

    public static void main(String[] args) {
        MobilePhone mobilePhone1 =
                new MobilePhone("16 GB", "4 GB", "3200MHz", "5 inches");
        MobilePhone mobilePhone2 =
                new MobilePhone("8 GB", "2 GB", "2400MHz", "5.5 inches", false);
        MobilePhone mobilePhone3 =
                new MobilePhone("4 GB", "1 GB", "1800MHz", "4.8 inches", true, false);
        MobilePhone mobilePhone4 =
                new MobilePhone("32 GB", "4 GB", "2x3200MHz", "6.28 inches", true, false, false);

        System.out.println(mobilePhone1);
        System.out.println(mobilePhone2);
        System.out.println(mobilePhone3);
        System.out.println(mobilePhone4);
    }
}

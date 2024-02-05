public class Main {
    public static void main(String[] args) throws Exception {
//        Phone phone = new Phone("iPhone XS", PhoneColors.Red, 15000, 25);
//
//        phone.setBalance(phone.getBalance()+10);
//
//        System.out.println(phone.getBalance() + " телефонов на складе");
//
//        System.out.println(phone.toString());

        PhonesStore phonesStore = new PhonesStore();

        phonesStore.addPhone(new Phone("iPhone XS", PhoneColors.Red, 15000, 25));
        phonesStore.addPhone(new Phone("iPhone XR", PhoneColors.Yellow, 12000, 15));
        phonesStore.addPhone(new Phone("iPhone 13", PhoneColors.SpaceGray, 45000, 50));

        System.out.println(phonesStore.getPhonesInTableView());

        phonesStore.savePhonesToFile();
    }
}
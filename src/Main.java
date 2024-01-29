public class Main {
    public static void main(String[] args) throws Exception {
        Phone phone = new Phone("iPhone XS", PhoneColors.Red, 15000, 25);

        phone.setBalance(phone.getBalance()+10);

        System.out.println(phone.getBalance() + " телефонов на складе");

        System.out.println(phone);
    }
}
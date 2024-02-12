public class Main {
    public static void main(String[] args) throws Exception {
        PhonesStore phonesStore = new PhonesStore();

        boolean isRun = true;

        while (isRun) {
            ConsoleUtil.printString(phonesStore.getPhonesInTableView());

            ConsoleUtil.printlnString("----------");
            ConsoleUtil.printlnString("Меню:");
            ConsoleUtil.printlnString("1.Загрузить список телефонов из файла");
            ConsoleUtil.printlnString("2.Сохранить список телефонов в файл");
            ConsoleUtil.printlnString("3.Добавить телефон в список");
            ConsoleUtil.printlnString("4.Удалить телефон из списка");
            ConsoleUtil.printlnString("5.Изменить данные телефона");
            ConsoleUtil.printlnString("0.Выйти из программы");

            int action = ConsoleUtil.inputInt("Введите номер пункта: ", 0, 5);

            switch (action) {
                case 0: {
                    isRun = false;
                    ConsoleUtil.printlnString("Программа будет закрыта");
                }
                break;
                case 1: {
                    phonesStore.loadPhonesFromFile();
                    ConsoleUtil.printlnString("Список телефонов успешно загружен");
                }
                break;
                case 2: {
                    phonesStore.savePhonesToFile();
                    ConsoleUtil.printlnString("Список телефонов успешно сохранён");
                }
                break;
                case 3: {
                    String model = ConsoleUtil.inputString("Введите модель телефона: ", 3, 30);
                    String color = PhoneColors.getColorByNumber(ConsoleUtil.inputInt("Введите номер цвета от 1 до 3: ", 1, 3));
                    int price = ConsoleUtil.inputInt("Введите стоимость телефона: ", 1, 1000000);
                    int balance = ConsoleUtil.inputInt("Введите кол-во телефонов на складе: ", 0, 100);

                    Phone phone = new Phone(model, color, price, balance);

                    phonesStore.addPhone(phone);
                }
                break;
                case 4: {
                    int number = ConsoleUtil.inputInt("Введите номер телефона для удаления: ", 1, phonesStore.getPhonesCount());

                    phonesStore.deletePhoneByNumber(number);
                }
                break;
                case 5: {
                    int number = ConsoleUtil.inputInt("Введите номер телефона для изменения данных: ", 1, phonesStore.getPhonesCount());

                    Phone phone = phonesStore.getPhoneByNumber(number);

                    //todo доделать изменение данных 1 телефона

                }
                break;
            }

        }
    }
}
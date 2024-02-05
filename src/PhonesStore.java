import java.util.ArrayList;
import java.util.Random;

public class PhonesStore {
    private ArrayList<Phone> phones;

    public PhonesStore() {
        phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public Phone getPhoneByNumber(int number) throws Exception {
        int index = number - 1;

        if (index < 0 || index > phones.size() - 1) {
            throw new Exception("Ошибка. Телефона с таким номером не существует");
        }

        return phones.get(index);
    }
}

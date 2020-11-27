import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<Integer, String> phonebook = new HashMap<>();

    public void add(String surname, Integer number) {
        phonebook.put(number, surname);
        System.out.printf("Add new element: \nName: %s  Number: %s\n", surname, number);
    }

    public void printPhoneBook() {
        System.out.println(phonebook);
    }

    public void get(String surname) {
        if(phonebook.containsValue(surname)) {
            for (Map.Entry item : phonebook.entrySet()) {
                if (item.getValue().equals(surname))
                System.out.println("Surname: " + item.getValue() + " Phone number: " + item.getKey());
            }
        }
        else System.out.println("Not in phonebook ");
    }
}

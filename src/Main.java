public class Main {

    public static void main(String[] args) {
        String[] myArray = {"apple", "kiwi", "lemon", "orange", "lemon", "pear", "apple", "apple", "grape", "banana"};
        Words words = new Words();
        words.printAllWords(myArray);
        words.printUniqueWords(myArray);
        words.printRepeatingWords(myArray);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Makaronkina", 656830278);
        phonebook.add("Ivanov", 866447597);
        phonebook.add("Makaronkina", 656758302);
        phonebook.add("Sidorov", 753758302);
        phonebook.add("Petrov", 613268302);
        phonebook.get("Makaronkina");
        phonebook.get("Pupkin");
    }
}

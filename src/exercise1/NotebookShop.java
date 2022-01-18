package exercise1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Computer computer1 = new Computer("Asus",1);
        Computer computer2 = new Computer("Acer",3);
        Computer computer3 = new Computer("HP",10);
        Computer computer4 = new Computer("Acer",3);
        Computer computer5 = new Computer("Asus",2);

        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);
        dataStore.add(computer5);

        dataStore.printInfo();

        dataStore.checkAvailability(computer1);
        dataStore.checkAvailability(computer2);
        dataStore.checkAvailability(computer3);
        dataStore.checkAvailability(computer4);
    }
}

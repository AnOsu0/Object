package exercise1;

public class DataStore {
    Computer[] computers = new Computer[100];
    private int computerNUmber = 0;

    public void add(Computer computer) {
        if (computerNUmber >= computers.length) {
            System.out.println("Brak miejsca w magazynie");
        } else {
            computers[computerNUmber] =computer;
            computerNUmber++;
        }
    }

    public void printInfo() {
        System.out.println("Dostępne komputery to:");
        if (computerNUmber == 0) {
            System.out.println("Brak komputerów w magazynie");
        } else {
            for (int i = 0; i < computerNUmber; i++) {
                System.out.println(computers[i]);
            }
        }
    }

    public void checkAvailability(Computer computer){
        int sameComputers = 0;
        for (int i = 0; i < computerNUmber; i++) {
            if (computers[i].equals(computer)){
                sameComputers++;
            }

        }
        System.out.println("Dostępna ilość tego komputera to: " + sameComputers);
    }

}

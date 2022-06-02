public class Bank {
    public static void main(String[] args) {
        //pierwsza osoba
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "989898836252";
        //tworzymy adres
        Address address1 = new Address();
        address1.city = "Warszawa";
        address1.postalCode = "20-222";
        address1.street = "Woronicza";
        address1.home = 22;
        address1.flat = 43;
        //taki sam adres zamieszkania i zameldowania
        person1.livingAddress=address1;
        person1.registeredAddress = address1;
        //pierwsze konto bankowe
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        //druga osoba
        Person person2 = new Person();
        person2.firstName = "Adam";
        person2.lastName = "Nieznański";
        person2.pesel = "39734873493";
        person2.registeredAddress = new Address();
        person2.registeredAddress.city = "Kraków";
        person2.registeredAddress.postalCode = "30-333";
        person2.registeredAddress.street = "Mickiewicza";
        person2.registeredAddress.home = 15;
        person2.registeredAddress.flat = 8;
        person2.livingAddress=address1;
        //drugie konto bankowe
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 25_000;

        System.out.println("Osoba1:");
        System.out.println(person1.firstName + " " + person1.lastName + " zamieszkały " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba2:");
        System.out.println(person2.firstName + " " + person2.lastName + " zamieszkały " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
    }
}

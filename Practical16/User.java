package Practical16;

public class User {
    public static void main(String[] args) {

        PhoneBook.addentry("dan brown",1112,"d@gmail.com","170");
        PhoneBook.addentry("dave brown",2222,"da@gmail.com","190");
        //PhoneBook.printPhoneBook("dan brown");
        //PhoneBook.printPhoneBook("dave brown");
        PhoneBook.updatePhoneBook("dan brown",99999);
        //PhoneBook.deleteentry("dave brown");
        PhoneBook.printall();


        

    }
}

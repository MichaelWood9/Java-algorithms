package Practical16;



import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //below create a hashmap named Phone map
    static Map<String,PhoneBookEntry> PhoneMap = new HashMap();

    public PhoneBook(Map<String, PhoneBookEntry> phoneMap) {
        PhoneMap = phoneMap;
    }

    public Map<String, PhoneBookEntry> getPhoneMap() {
        return PhoneMap;
    }

    public void setPhoneMap(Map<String, PhoneBookEntry> phoneMap) {
        PhoneMap = phoneMap;
    }

    //the method below addentry add an entry to the Phonemap
    //the method takes the details to create a phonebook entry then creates it
    //then the entry is added to the Phone map with a fullname as a key
    public static void addentry(String fullname, int phone, String email,String address) {
        PhoneBookEntry g = new PhoneBookEntry(fullname,phone,email,address);
        PhoneMap.put(fullname,g);

    }
    // the method below print out a selected entry from the phonemap
    public static void printPhoneBook(String name){
        System.out.println(PhoneMap.get(name));

    }
    // The method below updates an entry in the phonemap but only updates the number value of the entry.
    public static void updatePhoneBook(String name,int rvalue){
        PhoneBookEntry entry = PhoneMap.get(name);
        entry.setPhonenumber(rvalue);
    }

    //the method below deletes a selected entry from the phonemap
    public static void deleteentry(String name){
        PhoneMap.remove(name);

    }

    // the method below prints ou the entire phone map
    // it does this by looping through the phone and printing each value
    public static void printall(){
        for (PhoneBookEntry value : PhoneMap.values()) {
            System.out.println(value);
        }
    }


}

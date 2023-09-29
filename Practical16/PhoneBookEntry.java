package Practical16;

public class PhoneBookEntry {
    String fullname;
    int phonenumber;
    String email;
    String Address;

    public PhoneBookEntry(String fullname, int phonenumber, String email, String address) {
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.email = email;
        Address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "fullname='" + fullname + '\'' +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

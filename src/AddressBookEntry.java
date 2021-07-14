import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookEntry {
    private String name = "empty";
    private String address = "empty";
    private String city = "empty";
    private String state = "empty";
    private String zip = "empty";
    private String phone = "empty";
    private String email = "empty";


    //constructors
    public AddressBookEntry(){

    }



    //getters setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if(isEmailValid(email)){
            this.email = email;
        }
        else{
            System.out.println("that email is not valid.");
        }

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(isPhoneNumberValid(phone)){
            this.phone = phone;
        }
        else{
            System.out.println("that phone no. is not valid.");
        }


    }

    private boolean isEmailValid(String email){
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }
}

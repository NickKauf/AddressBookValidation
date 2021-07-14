public class AddressBook {
    public static void main(String[] args){
        AddressBookEntry test = new AddressBookEntry();
        test.setEmail("test@test.com");
        System.out.println(test.getEmail());
        test.setEmail("notanemail");
        System.out.println(test.getEmail());

        test.setPhone("(123)345-6789");
        System.out.println(test.getPhone());
        test.setPhone("5436");
        System.out.println(test.getPhone());

    }
}

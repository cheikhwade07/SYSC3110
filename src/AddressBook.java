import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Buddy_collection = new ArrayList();

    public AddressBook() {
    }

    public void addBuddy(BuddyInfo buddy) {
        this.Buddy_collection.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.Buddy_collection.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Test");
    }
}


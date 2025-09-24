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
        System.out.println("Address Book");
    }
}


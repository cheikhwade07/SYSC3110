public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        BuddyInfo Martin = new BuddyInfo("Martin", "5Ave", "541");
        System.out.println("Hello World! " + Martin.getName());
    }
}


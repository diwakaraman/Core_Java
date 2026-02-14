package core;

public class ThisKeywordManager {
    int managerId;
    String managerName;

    public void acceptData(int managerId, String managerName) {
        this.managerId = managerId;
        this.managerName = managerName;
    }
    public void show() {
        System.out.println(managerId);
        System.out.println(managerName);
    }
}

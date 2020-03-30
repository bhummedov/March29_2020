package March29_2020;

public class WorkstationTest {
    public static void main(String[] args) {
        String mainboard[]={"intel","3000","128"};
        Workstation myWrks = new Workstation(mainboard,64,8900,"amd","maxi",42);
        myWrks.setMainBoard();
        myWrks.installMemory(64);
        myWrks.installCPU();
        DellWorkStation myDell = new DellWorkStation(mainboard,128,2500,"intel","tower",29);
    }
}

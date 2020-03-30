package March29_2020;

public class DellWorkStation extends Workstation {
    public DellWorkStation(String[] mainBoardSpec, int memorySize, int cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, cpuType, housingType, screenSize);
    }

    void installDellSoftware(){
        System.out.println("Installed");
    }
}

package structural.fly_weight;

import java.awt.*;
import java.util.ArrayList;

public class MainFlyWeight {
    public static void main(String[] args) {
        System.out.println("Fly Weight");
        ArrayList<Computer> listOfComputers = new ArrayList<>();
        for (int ram = 1024; ram < 2048; ram++) {
            Computer computer = new Computer(OsSharedVars.getInstance().getOs(OsType.LIN, Bit.X32));
            computer.setRam(ram);
            listOfComputers.add(computer);
            //listOfComputers.add(new Computer(OsSharedVars.getInstance().getOs(OsType.LIN, Bit.X32), ram));
            listOfComputers.add(new Computer(OsSharedVars.getInstance().getOs(OsType.MAC, Bit.X32), ram));
            listOfComputers.add(new Computer(OsSharedVars.getInstance().getOs(OsType.WIN, Bit.X32), ram));
            listOfComputers.add(new Computer(OsSharedVars.getInstance().getOs(OsType.LIN, Bit.X64), ram));
            listOfComputers.add(new Computer(OsSharedVars.getInstance().getOs(OsType.MAC, Bit.X64), ram));
            listOfComputers.add(new Computer(OsSharedVars.getInstance().getOs(OsType.WIN, Bit.X64), ram));
        }

        ArrayList<DisplayedImage> images = new ArrayList<DisplayedImage>();
        images.add(DisplayedImageFactory.makeImage("url1",0,0));
        images.add(DisplayedImageFactory.makeImage("url2",10,10));
        images.add(DisplayedImageFactory.makeImage("url1",3,5));
    }
}

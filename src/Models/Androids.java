package Models;

import Services.OperationSystem;
import Services.Smartphones;

public class Androids implements Smartphones, OperationSystem {
    @Override
    public void call() {
        System.out.println("Call from Androids");
    }

    @Override
    public void sms() {
        System.out.println("Sms from Androids");
    }

    @Override
    public void internet() {
        System.out.println("Internet from Androids");
    }

    @Override
    public void loadOperationSystem() {
        System.out.println("Load LinuxOS operation system");
    }
}

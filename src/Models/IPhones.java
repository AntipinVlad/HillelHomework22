package Models;

import Services.OperationSystem;
import Services.Smartphones;

public class IPhones implements Smartphones, OperationSystem {
    @Override
    public void call() {
        System.out.println("Call from IPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sms from IPhone");
    }

    @Override
    public void internet() {
        System.out.println("Internet from IPhone");
    }

    @Override
    public void loadOperationSystem() {
        System.out.println("Load IOS operation system");
    }
}

import Models.Androids;
import Models.IPhones;
import Services.OperationSystem;
import Services.Smartphones;

public class Homework22Program {
    public static void main(String[] args) {
        Smartphones smartphonesAndroid = new Androids();
        Smartphones smartphonesIPhone = new IPhones();
        OperationSystem operationSystemAndroid = new Androids();
        OperationSystem operationSystemIPhone = new IPhones();
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        smartphonesAndroid.call();
        smartphonesAndroid.sms();
        smartphonesAndroid.internet();

        smartphonesIPhone.call();
        smartphonesIPhone.sms();
        smartphonesIPhone.internet();

        operationSystemAndroid.loadOperationSystem();
        operationSystemIPhone.loadOperationSystem();

        androids.loadOperationSystem();
        androids.call();
        androids.sms();
        androids.internet();

        iPhones.loadOperationSystem();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
    }
}

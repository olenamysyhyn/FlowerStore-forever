package ua.edu.ucu.apps.lab7flower.delivery;
import ua.edu.ucu.apps.lab7flower.flowers.flower.Item;
import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(LinkedList<Item> items) {
        return "will be delivered";
    }
}

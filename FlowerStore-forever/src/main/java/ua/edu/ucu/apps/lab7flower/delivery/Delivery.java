package ua.edu.ucu.apps.lab7flower.delivery;
import ua.edu.ucu.apps.lab7flower.flowers.flower.Item;
import java.util.LinkedList;

public interface Delivery {
    public String deliver(LinkedList<Item> items);


}
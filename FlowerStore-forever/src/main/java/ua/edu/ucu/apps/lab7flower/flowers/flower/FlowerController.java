package ua.edu.ucu.apps.lab7flower.flowers.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }


    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/list")
    public List<Flower> getFlower() {
        return flowerService.getFlowers();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}

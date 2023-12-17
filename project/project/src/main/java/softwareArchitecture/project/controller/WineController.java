package softwareArchitecture.project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import softwareArchitecture.project.repository.WineRepository;
import softwareArchitecture.project.service.WineService;

@RestController
@RequestMapping("/wine")
public class WineController {

    private final WineService wineService;

    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping
    public List<WineRepository> getAllWines() {
        return wineService.getAllWines();
    }

    @GetMapping("/sortedByABV")
    public List<WineRepository> getAllWinesSortedByABV() {
        return wineService.getAllWinesSortedByABV();
    }

    @GetMapping("/sortedByName")
    public List<WineRepository> getAllWinesSortedByName() {
        return wineService.getAllWinesSortedByName();
    }
}
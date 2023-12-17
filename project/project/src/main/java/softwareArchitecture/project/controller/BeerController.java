package softwareArchitecture.project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import softwareArchitecture.project.repository.BeerRepository;
import softwareArchitecture.project.repository.BeerRepository;
import softwareArchitecture.project.service.BeerService;

@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping
    public List<BeerRepository> getAllBeers() {
        return beerService.getAllBeers();
    }

    @GetMapping("/sortedByABV")
    public List<BeerRepository> getAllBeersSortedByABV() {
        return beerService.getAllBeersSortedByABV();
    }

    @GetMapping("/sortedByName")
    public List<BeerRepository> getAllBeersSortedByName() {
        return beerService.getAllBeersSortedByName();
    }
}

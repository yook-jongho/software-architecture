package softwareArchitecture.project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import softwareArchitecture.project.repository.CocktailRepository;
import softwareArchitecture.project.service.CocktailService;

@RestController
@RequestMapping("/cocktail")
public class CocktailController {

    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping
    public List<CocktailRepository> getAllCocktails() {
        return cocktailService.getAllCocktails();
    }

    @GetMapping("/sortedByABV")
    public List<CocktailRepository> getAllCocktailsSortedByABV() {
        return cocktailService.getAllCocktailsSortedByABV();
    }

    @GetMapping("/sortedByName")
    public List<CocktailRepository> getAllCocktailsSortedByName() {
        return cocktailService.getAllCocktailsSortedByName();
    }
}

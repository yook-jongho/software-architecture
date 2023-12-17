package softwareArchitecture.project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import softwareArchitecture.project.repository.HighballRepository;
import softwareArchitecture.project.service.HighballService;

@RestController
@RequestMapping("/highball")
public class HighballController {

    private final HighballService highballService;

    public HighballController(HighballService highballService) {
        this.highballService = highballService;
    }

    @GetMapping
    public List<HighballRepository> getAllHighballs() {
        return highballService.getAllHighballs();
    }

    @GetMapping("/sortedByABV")
    public List<HighballRepository> getAllHighballsSortedByABV() {
        return highballService.getAllHighballsSortedByABV();
    }

    @GetMapping("/sortedByName")
    public List<HighballRepository> getAllHighballsSortedByName() {
        return highballService.getAllHighballsSortedByName();
    }
}
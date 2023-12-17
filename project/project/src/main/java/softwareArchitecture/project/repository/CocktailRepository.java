package softwareArchitecture.project.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CocktailRepository {
    @JsonProperty
    private String name;
    @JsonProperty
    private String ABV;
    @JsonProperty
    private String description;
    @JsonProperty
    private String recipe;
    @JsonProperty
    private String Url;

    public CocktailRepository(String name, String ABV, String description, String recipe, String Url) {
        this.name = name;
        this.ABV = ABV;
        this.description = description;
        this.recipe = recipe;
        this.Url = Url;
    }

    @JsonIgnore
    public double getABVAsDouble() {
        try {
            String[] parts = ABV.split("-");
            String lowerABV = parts[0].replaceAll("[^\\d.]", "");
            return Double.parseDouble(lowerABV);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public String getName() {
        return name;
    }
}

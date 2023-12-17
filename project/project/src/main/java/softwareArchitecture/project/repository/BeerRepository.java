package softwareArchitecture.project.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeerRepository {
    @JsonProperty
    private String name;
    @JsonProperty
    private String ABV;
    @JsonProperty
    private String description;
    @JsonProperty
    private String Url;

    public BeerRepository(String name, String ABV, String description, String Url) {
        this.name = name;
        this.ABV = ABV;
        this.description = description;
        this.Url = Url;
    }

    @JsonIgnore
    public double getABVAsDouble() {
        try {
            return Double.parseDouble(ABV.replace("%", ""));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public String getName() {
        return name;
    }
}

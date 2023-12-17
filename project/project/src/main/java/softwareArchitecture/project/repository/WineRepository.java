package softwareArchitecture.project.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WineRepository {
    @JsonProperty
    private String name;
    @JsonProperty
    private String ABV;
    @JsonProperty
    private String description;
    @JsonProperty
    private String Url;

    public WineRepository(String name, String ABV, String description, String Url) {
        this.name = name;
        this.ABV = ABV;
        this.description = description;
        this.Url = Url;
    }

    @JsonIgnore
    public double getABVAsDouble() {
        try {
            String[] parts = ABV.split("-");
            return Double.parseDouble(parts[0]);
        } catch (Exception e) {
            return 0.0;
        }
    }

    public String getName() {
        return name;
    }
}

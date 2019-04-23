package bff.eygm.common.model.loyaldictionory;

import java.util.List;

/**
 * @author Nimesha on 11/7/2018 1:04 PM
 */
public class PointsModel {
    private int miles;
    private List<String> classes;

    public PointsModel(int miles, List<String> classes) {
        this.miles = miles;
        this.classes = classes;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }
}

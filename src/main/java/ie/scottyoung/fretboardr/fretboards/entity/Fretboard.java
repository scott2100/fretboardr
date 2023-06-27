package ie.scottyoung.fretboardr.fretboards.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fretboards")
public class Fretboard {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "number_of_strings")
    private Integer numberOfStrings;

    @Column(name = "number_of_frets")
    private Integer numberOfFrets;

    @Column(name = "tuning", length = Integer.MAX_VALUE)
    private String tuning;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public Integer getNumberOfFrets() {
        return numberOfFrets;
    }

    public void setNumberOfFrets(Integer numberOfFrets) {
        this.numberOfFrets = numberOfFrets;
    }

    public String getTuning() {
        return tuning;
    }

    public void setTuning(String tuning) {
        this.tuning = tuning;
    }

}
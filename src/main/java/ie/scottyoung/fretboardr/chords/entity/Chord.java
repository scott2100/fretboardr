package ie.scottyoung.fretboardr.chords.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chords")
public class Chord {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "chord_name", length = 20)
    private String chordName;

    @Column(name = "intervals", length = 50)
    private String intervals;

    @Column(name = "\"position\"", length = 20)
    private String position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChordName() {
        return chordName;
    }

    public void setChordName(String chordName) {
        this.chordName = chordName;
    }

    public String getIntervals() {
        return intervals;
    }

    public void setIntervals(String intervals) {
        this.intervals = intervals;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
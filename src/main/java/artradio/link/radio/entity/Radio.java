package artradio.link.radio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "radio")
@Getter
@Setter
public class Radio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "slug")
    private String slug;

    @Column(name = "img")
    private String img;

    @Column(name = "description")
    private String description;

    @Column(name = "contact")
    private String contact;

    @OneToMany(mappedBy = "radio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RadioType> radioTypes = new HashSet<>();

    @OneToMany(mappedBy = "radio", cascade = CascadeType.ALL)
    private Set<RadioSong> radioSongs = new HashSet<>();


    // use RadioType bidirectional
    public void addRadioType(RadioType radioType) {
        if (this.radioTypes == null) {
            this.radioTypes = new HashSet<>();
        }
        this.radioTypes.add(radioType);
        radioType.setRadio(this);
    }
    // use RadioSong bidirectional
    public void addRadioSong(RadioSong radioSong) {
        if (radioSongs == null) {
            return;
        }
        radioSongs.add(radioSong);
        radioSong.setRadio(this);
    }

}

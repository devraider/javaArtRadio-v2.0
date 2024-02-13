package artradio.link.radio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "radio_song")
@Getter
@Setter
public class RadioSong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "song_singer")
    private String singer;

    @Column(name = "song_singer")
    private String name;

    @Column(name = "song_likes")
    private long likes;

    @Column(name = "song_dislikes")
    private long dislikes;

    @Column(name = "youtube_id")
    private String youtubeId;

    @Column(name = "date_radio_played")
    @CreationTimestamp
    private Date dateCreated;

    @ManyToOne
    @JoinColumn(name = "radio_id", nullable = false)
    private Radio radio;

}

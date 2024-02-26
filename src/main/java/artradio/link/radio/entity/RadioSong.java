package artradio.link.radio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "radio_songs")
@Getter
@Setter
public class RadioSong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "singer")
    private String singer;

    @Column(name = "name")
    private String name;

    @Column(name = "likes")
    private long likes;

    @Column(name = "dislikes")
    private long dislikes;

    @Column(name = "youtube_id")
    private String youtubeId;

    @Column(name = "date_stream_played")
    @CreationTimestamp
    private Date dateStreamPlayed;

    @Column(name = "date_inserted")
    @UpdateTimestamp
    private Date dateInserted;

    @ManyToOne
    @JoinColumn(name = "radio_id", nullable = false)
    private Radio radio;

}

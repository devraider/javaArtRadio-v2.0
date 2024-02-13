package artradio.link.radio.dao;

import artradio.link.radio.entity.RadioSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioSongRepository extends JpaRepository<RadioSong, Long> {
}

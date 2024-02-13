package artradio.link.radio.dao;

import artradio.link.radio.entity.Radio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioRepository extends JpaRepository<Radio, Long> {
}

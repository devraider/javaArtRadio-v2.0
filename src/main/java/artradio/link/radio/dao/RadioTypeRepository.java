package artradio.link.radio.dao;

import artradio.link.radio.entity.RadioType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioTypeRepository extends JpaRepository<RadioType, Long> {
}

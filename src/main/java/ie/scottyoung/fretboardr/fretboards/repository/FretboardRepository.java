package ie.scottyoung.fretboardr.fretboards.repository;

import ie.scottyoung.fretboardr.fretboards.entity.Fretboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FretboardRepository extends JpaRepository<Fretboard, Long> {
}
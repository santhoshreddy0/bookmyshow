package org.santhosh.bookmyshow.repositories;

import org.santhosh.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
}

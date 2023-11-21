package org.santhosh.bookmyshow.repositories;

import org.santhosh.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long> {
}

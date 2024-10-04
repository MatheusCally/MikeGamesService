package br.com.mike_games_service.domain.port;

import br.com.mike_games_service.domain.model.WishlistGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends JpaRepository<WishlistGame, Long> {
}

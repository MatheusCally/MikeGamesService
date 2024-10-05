package br.com.mike_games_service.domain.port;

import br.com.mike_games_service.domain.model.WishlistGame;
import br.com.mike_games_service.domain.model.WishlistId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistRepository{
    List<WishlistGame> findAllByWishlistId_Username(String username);

    WishlistGame save(WishlistGame wishlistGame);

}

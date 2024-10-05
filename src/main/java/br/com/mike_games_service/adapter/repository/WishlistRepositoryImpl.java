package br.com.mike_games_service.adapter.repository;

import br.com.mike_games_service.domain.model.WishlistGame;
import br.com.mike_games_service.domain.model.WishlistId;
import br.com.mike_games_service.domain.port.WishlistRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishlistRepositoryImpl extends WishlistRepository, JpaRepository<WishlistGame, WishlistId> {

}

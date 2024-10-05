package br.com.mike_games_service.domain.service;

import br.com.mike_games_service.domain.model.WishlistGame;
import br.com.mike_games_service.domain.port.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    WishlistRepository repository;

    public List<WishlistGame> getWishlistsGames(String username){
        return this.repository.findAllByWishlistId_Username(username);
    }

    public void save(WishlistGame wishlistGame){
        repository.save(wishlistGame);
    }

}

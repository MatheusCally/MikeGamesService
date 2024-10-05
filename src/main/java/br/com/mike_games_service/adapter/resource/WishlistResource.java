package br.com.mike_games_service.adapter.resource;

import br.com.mike_games_service.domain.model.WishlistGame;
import br.com.mike_games_service.domain.service.WishlistService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Resource
@RestController
@RequestMapping("/wishlist")
public class WishlistResource {

    @Autowired
    private WishlistService service;

    @GetMapping("/{username}")
    private ResponseEntity<List<WishlistGame>> getWishlist(@PathVariable("username") String username){
        return ResponseEntity.ok(service.getWishlistsGames(username));
    }

    @PostMapping
    private ResponseEntity<String> save(@RequestBody WishlistGame wishlistGame){
        service.save(wishlistGame);
        return ResponseEntity.ok("Success");
    }
}

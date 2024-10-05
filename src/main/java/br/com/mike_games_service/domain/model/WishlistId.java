package br.com.mike_games_service.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class WishlistId {

    @Column(name="game_id")
    private Long gameId;

    @Column(name="username")
    private String username;
}

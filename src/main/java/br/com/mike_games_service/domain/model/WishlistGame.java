package br.com.mike_games_service.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name="WishlistGame")
@Table(name="wishlist")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WishlistGame {

    @EmbeddedId
    private WishlistId wishlistId;

    @Column(name="date")
    private LocalDateTime date;
}

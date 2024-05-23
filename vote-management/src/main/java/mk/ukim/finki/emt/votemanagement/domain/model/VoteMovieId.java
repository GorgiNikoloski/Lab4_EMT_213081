package mk.ukim.finki.emt.votemanagement.domain.model;

import com.example.moviecatalog.domain.valueobjects.Rating;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
import mk.ukim.finki.emt.votemanagement.domain.valueobjects.MovieId;



public class VoteMovieId extends DomainObjectId {

    @Column(name = "rtg", nullable = false)
    private Rating rating;

    @AttributeOverride(name="id", column = @Column(name="movie_id", nullable = false))
    private MovieId movieId;
}

package mk.ukim.finki.emt.votemanagement.domain.model;


import com.example.moviecatalog.domain.models.Movie;
import jakarta.persistence.*;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "votes")
public class Vote extends AbstractEntity<VoteId> {

    private Integer total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Movie> voteMovieList;

//    private Vote() {
//        super(VoteId.randomId(VoteId.class));
//    }

    public Movie addVote(@NonNull Movie movie){
        Objects.requireNonNull(movie, "movie must not be null");
        var item = new Movie();
        voteMovieList.add(item);
        return item;
    }

}

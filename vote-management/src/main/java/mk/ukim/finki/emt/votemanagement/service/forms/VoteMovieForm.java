package mk.ukim.finki.emt.votemanagement.service.forms;


import com.example.moviecatalog.domain.models.Movie;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class VoteMovieForm {

    @NotNull
    private Movie movie;

    private int total;

}

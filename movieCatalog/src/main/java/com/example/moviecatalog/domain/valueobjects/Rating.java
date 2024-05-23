package com.example.moviecatalog.domain.valueobjects;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Rating implements ValueObject {

    private final int rating;

    protected Rating() {
        this.rating = 0;
    }
}

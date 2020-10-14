package org.wecancodeit.review;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;



@Repository
public class ReviewRepository {
    Map<String, Review> reviewsList = new HashMap<>();

    //constructor to handle our database
    public ReviewRepository() {
        Review dixie = new Review(111, "DIXIE® EVERYDAY 8 1/2", "/Dixie.png", "Soak Proof",
                "Good", "Plate has pretty design and is durable but shelf life is longer that that of the Compostable plates.", "10/01/2020");

        Review glad = new Review(222, "Glad Square Disposable Paper Plates 8 1/2", "/Glad.png", "Soak Proof",
                "Fair", "Plate has square design and is durable but shelf life is longer that that of the Compostable plates.", "10/02/2020");

        Review compostable = new Review(333, "Compostable Paper Plates 9 inch", "/Compostable.png","NOT Soak Proof",
                "Very Good", "Plate is easily compostable but has no design pattern and can get soggy.","10/03/2020");


        reviewsList.put(String.valueOf(dixie.getReviewId()), dixie);
        reviewsList.put(String.valueOf(glad.getReviewId()), glad);
        reviewsList.put(String.valueOf(compostable.getReviewId()), compostable);
    }

    //constructor for testing only .... uses varArgs to add none or as many as needed
    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd)
        reviewsList.put(String.valueOf(review.getReviewId()), review);


    }

    public Review findOne(int reviewId) {
        return reviewsList.get(reviewId);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}

package org.wecancodeit.review;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepositoryNew extends CrudRepository< Review, Integer> {

    List<Review> findByReviewTitle (String reviewTitle);
    Review findById(int reviewId);
}


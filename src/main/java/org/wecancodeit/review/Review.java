package org.wecancodeit.review;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

//Review = Table
@Entity
public class Review {

   @Autowired
   @Id
    private int reviewId;
    private String reviewTitle;
    private String reviewCategory;
    private String reviewRating;
    private String reviewContent;
    private String date;
    private String pics;

        //Default Constructor (Empty).
    protected Review(){

    }


    public Review(int reviewId, String reviewTitle, String reviewCategory, String reviewRating, String reviewContent, String date){
        this.reviewId = reviewId;
        this.reviewTitle = reviewTitle;
        this.reviewCategory = reviewCategory;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
        this.date = date;
    }

    public Review(int reviewId, String reviewTitle, String pics, String reviewCategory, String reviewRating, String reviewContent, String date){
        this.reviewId = reviewId;
        this.reviewTitle = reviewTitle;
        this.reviewCategory = reviewCategory;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
        this.date = date;
        this.pics = pics;
    }

    @Override
    public String toString() {
        return String.format(
                "Review[reviewId= %d, reviewTitle=%s', reviewCategory=%s', reviewRating=%s', reviewContent=%s', date=%s', pics=%s']",
                reviewId, reviewTitle, reviewCategory, reviewRating,  reviewContent, date, pics);
    }

    public int getReviewId() { return reviewId; }
    public String getReviewTitle() {return reviewTitle; }
    public String getReviewCategory() {return reviewCategory; }
    public String getReviewRating() {return reviewRating; }
    public String getReviewContent() {return reviewContent; }
    public String getDate() { return date;}
    public String getPics() { return pics;}

    public void setReviewId(int reviewId) {reviewId = reviewId;}
    public void setReviewTitle(String reviewTitle) {reviewTitle = reviewTitle; }
    public void setReviewCategory(String reviewCategory) {reviewCategory = reviewCategory; }
    public void setReviewRating(String reviewRating) {reviewRating = reviewRating; }
    public void setDate(String date) {date = date;}

    public void displayReviewDetails(String reviewTitle, int reviewId) {
    }
}

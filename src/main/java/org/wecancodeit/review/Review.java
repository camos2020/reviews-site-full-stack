package org.wecancodeit.review;

public class Review {

    private String reviewId;
    private String reviewTitle;
    private String reviewCategory;
    private String reviewRating;
    private String reviewContent;
    private String date;
    private String pics;

    public Review(String reviewId, String reviewTitle, String reviewCategory, String reviewRating, String reviewContent, String date){
        this.reviewId = reviewId;
        this.reviewTitle = reviewTitle;
        this.reviewCategory = reviewCategory;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
        this.date = date;
    }

    public Review(String reviewId, String reviewTitle, String pics, String reviewCategory, String reviewRating, String reviewContent, String date){
        this.reviewId = reviewId;
        this.reviewTitle = reviewTitle;
        this.reviewCategory = reviewCategory;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
        this.date = date;
        this.pics = pics;
    }

    public String getReviewId() { return reviewId; }
    public String getReviewTitle() {return reviewTitle; }
    public String getReviewCategory() {return reviewCategory; }
    public String getReviewRating() {return reviewRating; }
    public String getReviewContent() {return reviewContent; }
    public String getDate() { return date;}
    public String getPics() { return pics;}

    public void setReviewId(String reviewId) {reviewId = reviewId;}
    public void setReviewTitle(String reviewTitle) {reviewTitle = reviewTitle; }
    public void setReviewCategory(String reviewCategory) {reviewCategory = reviewCategory; }
    public void setReviewRating(String reviewRating) {reviewRating = reviewRating; }
    public void setDate(String date) {date = date;}

    public void displayReviewDetails(String reviewTitle, String reviewId) {
    }
}

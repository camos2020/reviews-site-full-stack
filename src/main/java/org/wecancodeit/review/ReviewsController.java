package org.wecancodeit.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
public class ReviewsController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewModel", reviewRepo.findAll());
        return "reviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value="reviewId") String reviewId, Model model) {
        model.addAttribute("reviewModel", reviewRepo.findOne(reviewId));
        return "reviewTemplate";

    }
}

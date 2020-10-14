package org.wecancodeit.review;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Reviews_Full_Stack_App {

    private static final Logger log = LoggerFactory.getLogger(Reviews_Full_Stack_App.class);

    public static void main(String[] args) {
        SpringApplication.run(Reviews_Full_Stack_App.class);
    }


    @Bean
    public CommandLineRunner demo(ReviewRepositoryNew repository) {
        return (args) -> {
            // save a few reviews
            repository.save(new Review(111, "DIXIE® EVERYDAY 8 1/2", "Coated",
                    "Good", "Plate has pretty design and is durable but shelf life is longer that that of the Compostable plates.", "10/01/2020"));

            repository.save(new Review(222, "Glad Square Disposable Paper Plates 8 1/2", "/Glad.png", "Coated",
                    "Fair", "Plate has square design and is durable but shelf life is longer that that of the Compostable plates.", "10/02/2020"));

            repository.save(new Review(333, "Compostable Paper Plates 9 inch", "/Compostable.png", "UN-Coated",
                    "Very Good", "Plate is easily compostable but has no design pattern and can occasionally get soggy with a lot of liquid", "10/03/2020"));

            repository.save(new Review(444, "Stock Your Home 10 inch", "/StockYourHome.png", "UN-Coated",
                    "Fair", "Plate is somewhat compostable and comes with 4 paper plate holders but, gets soggy very quickly.", "10/14/2020"));

            repository.save(new Review(555, "Hefty Everyday Medium Round Foam 8 1/2", "/Hefty-Foam.png", "Coated",
                    "Poor", "Plate is durable and guaranteed soak proof but, some experts estimate that the decomposition of Styrofoam can be up to 500 years", "10/10/2020"));


            // fetch all reviews
            log.info("Reviews found with findAll():");
            log.info("-------------------------------");
            for (Review reviewId : repository.findAll()) {
                log.info(reviewId.toString());
            }
            log.info("");

            // fetch an individual review by ID
            Review reviewId = repository.findById(111);
            log.info("Review found with findById(111):");
            log.info("--------------------------------");
            log.info(reviewId.toString());
            log.info("");

            //fetch reviews by lTitle
           log.info("Customer found with findByTitle('Glad Square Disposable Paper Plates 8 1/2'):");
           log.info("--------------------------------------------");
           repository.findByReviewTitle("Glad Square Disposable Paper Plates 8 1/2").forEach(title -> {
               log.info(title.toString());
           });
             for (Review bauer : repository.findByReviewTitle("Glad Square Disposable Paper Plates 8 1/2")) {
              log.info(bauer.toString());
             }
           log.info("");

//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByLastName("Bauer").forEach(bauer -> {
//                log.info(bauer.toString());
//            });
//            // for (Customer bauer : repository.findByLastName("Bauer")) {
//            //  log.info(bauer.toString());
//            // }
//            log.info("");
       };

   }
   }

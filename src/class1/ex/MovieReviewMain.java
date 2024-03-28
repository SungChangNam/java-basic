package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인셍은 무한루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간영화";

        MovieReview[] movieReviews = new MovieReview[]{inception, aboutTime};

        for (MovieReview review : movieReviews) {
            System.out.println("영화 제목:" +review.title+",  리뷰:" +review.review) ;
        }




    }
}

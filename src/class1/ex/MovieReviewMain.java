package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인셍은 무한루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간영화";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};

        for (MovieReview review : movieReviews) {
            System.out.println("영화 제목:" +review.title+",  리뷰:" +review.review) ;
        }




    }
}

package com.demo.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.demo.models.Movie;

public class MyLambdaHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    List<Movie> movies = Arrays.asList(
            new Movie("Movie 1", "director 1", 4.5),
            new Movie("Movie 2", "director 2", 4.9),
            new Movie("Movie 3", "director 3", 2.7),
            new Movie("Movie 4", "director 4", 3.8));

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent event, Context context) {

        try {
            String inputRating = event.getQueryStringParameters().get("rating");
            double rating = Double.parseDouble(inputRating);

            List<Movie> filtereMovies = new ArrayList<>();
            for (Movie m : movies) {
                if (m.getRating() >= rating) {
                    filtereMovies.add(m);
                }
            }

            return new APIGatewayProxyResponseEvent()
                    .withStatusCode(200)
                    .withBody(filtereMovies.toString());
        } catch (Exception e) {
            return new APIGatewayProxyResponseEvent()
                    .withStatusCode(200)
                    .withBody(movies.toString());

        }
    }

}

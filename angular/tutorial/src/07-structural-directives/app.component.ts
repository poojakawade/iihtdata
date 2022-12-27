import { Component } from "@angular/core";
import { Movie } from "./movie";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent{
    // movies:Array<Movie> = []
    movies:Movie[] = []

    load(){
        this.movies.push({title: "Superman", director: "Tom", rating: 4.8});
        this.movies.push({title: "Ironman", director: "Mike", rating: 4.1});
        this.movies.push({title: "Hulk", director: "Kim", rating: 3.4});
        this.movies.push({title: "Flash", director: "Kelly", rating: 3.9});
        this.movies.push({title: "Green Lantern", director: "Miley", rating: 4.7});
    }


    addMovie(title:string, director:string, rating:number){
        this.movies.push({title: title, director: director, rating: rating});
    }

    deleteMovieByIndex(index:number){
        this.movies.splice(index, 1);
    }

}
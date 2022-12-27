import { Component, OnInit } from '@angular/core';
import { Movie } from './../../movie';
import { MovieService } from './../../movie.service';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.scss']
})
export class MovieListComponent implements OnInit {

  movies:Movie[] = [];

  constructor(private _movieService:MovieService) { }

  ngOnInit(): void {
    console.log("before getAll")
    this.fetchAllMovies()
    console.log("after getAll")
  }

  fetchAllMovies(){
    this._movieService.getAll().subscribe({
      next: (res:any)=>{
        console.log(res)
        this.movies = res;
      },
      error: (err)=>{
        console.error(err)
      }
    })
  }

  create(){
    let movie:Movie = {id: 0, title: new Date().toLocaleTimeString(), author: "IamAuthor", rating: 3.3}

    this._movieService.createMovie(movie).subscribe({
      next: (res)=>{
        this.fetchAllMovies();
      }
    })
  }


  deleteMovie(id:string|number){
    console.log("movie id is : "+id)
  }

  /*
goto(id){
  this.router.navigateByUrl('/abc/movie/id')
}
  */

}

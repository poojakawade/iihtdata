import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Movie } from './movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  // p04-springboot-h2-exception
  private host:string = "http://localhost:8080/api/v1/movies";

  // FeignClient, RestTemplate, WebClient ====> HttpClient

  // @Autorwired ==> inject in consutructor

  constructor(private _http:HttpClient) { }

  getAll(){
    return this._http.get(this.host);
  }

  findById(id:string|number){
    return this._http.get(this.host+"/"+id);
  }

  createMovie(movie:Movie){
    return this._http.post(this.host, movie);
  }

}

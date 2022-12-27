import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { MovieByidComponent } from './components/movie-byid/movie-byid.component';
import { HttpClientModule } from "@angular/common/http";

@NgModule({
    declarations: [AppComponent, MovieListComponent, MovieByidComponent], // component, directive, pipe
    imports: [BrowserModule, HttpClientModule], // other modules
    bootstrap: [AppComponent] // starting point
})
export class AppModule{}
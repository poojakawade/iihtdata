import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { Comp1Component } from './components/comp1/comp1.component';
import { Comp2Component } from './components/comp2/comp2.component';

@NgModule({
    declarations: [AppComponent, Comp1Component, Comp2Component], // component, directive, pipe
    imports: [BrowserModule], // other modules
    bootstrap: [AppComponent] // starting point
})
export class AppModule{}
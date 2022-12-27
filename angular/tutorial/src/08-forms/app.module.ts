import { NgModule } from "@angular/core";
import { ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";

@NgModule({
    declarations: [AppComponent], // component, directive, pipe
    imports: [BrowserModule, ReactiveFormsModule], // other modules
    bootstrap: [AppComponent] // starting point
})
export class AppModule{}
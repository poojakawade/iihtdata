import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { FooterComponent } from "./components/footer/footer.component";
import { HeaderComponent } from "./components/header/header.component";
import { ButtonComponent } from './components/button/button.component';

@NgModule({
    declarations: [AppComponent, HeaderComponent, FooterComponent, ButtonComponent], // component, directive, pipe
    imports: [BrowserModule], // other modules
    bootstrap: [AppComponent] // starting point
})
export class AppModule{}
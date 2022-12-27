import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { AboutComponent } from './components/about/about.component';
import { RouterModule, Routes } from "@angular/router";

const routes: Routes = [
    { path: "home", component: HomeComponent },
    { path: "about", component: AboutComponent },
    { path: "login", component: LoginComponent },
    { path: "welcome", component: WelcomeComponent },

    { path: "**", redirectTo: "home"}
];

@NgModule({
    declarations: [AppComponent, HeaderComponent, FooterComponent, HomeComponent, LoginComponent, WelcomeComponent, AboutComponent], // component, directive, pipe
    imports: [BrowserModule, RouterModule.forRoot(routes)], // other modules
    bootstrap: [AppComponent] // starting point
})
export class AppModule{}
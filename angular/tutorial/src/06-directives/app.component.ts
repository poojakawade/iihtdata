import { Component } from "@angular/core";

@Component({
    selector: "app-root",
    templateUrl: "app.component.html",
    styleUrls: ["app.component.scss"]
})
export class AppComponent{
    flag:boolean = false;

    mycssclass:string = "";

    mystylecss = {
        "font-size": "2em",
        "backgroundColor": "black",
        "color": "white",
        "borderRadius": "4px"
    }

    toggle(){
        this.flag = !this.flag;

        this.updateClassName();
        this.updateStyle();
    }

    updateClassName(){
        if(this.flag){
            this.mycssclass = "success";
        } else {
            this.mycssclass = "error";
        }
    }

    updateStyle(){
        if(this.flag){
            this.mystylecss.color = "white";
            this.mystylecss.backgroundColor = "black";
            this.mystylecss["font-size"] = "2em";
        } else {
            this.mystylecss.color = "black";
            this.mystylecss.backgroundColor = "white";
            this.mystylecss["font-size"] = "1em";
        }
    }
}
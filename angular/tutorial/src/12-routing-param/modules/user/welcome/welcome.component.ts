import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {

  name:string = "";

  constructor(private activatedRoute:ActivatedRoute, private router:Router) { 
    this.activatedRoute.params.subscribe((parameters:any)=>{
      console.log(parameters);
      if((parameters.name+"").trim().length>2){
        this.name = parameters.name;
      } else {
        console.log("invalid");
        this.router.navigateByUrl("/user/login");
      }
    })
  }

  ngOnInit(): void {
  }

}

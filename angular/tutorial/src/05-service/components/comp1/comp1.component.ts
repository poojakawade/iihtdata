import { Component, OnInit } from '@angular/core';
import { Book } from 'src/05-service/book';
import { BookService } from './../../services/book.service';

@Component({
  selector: 'app-comp1',
  templateUrl: './comp1.component.html',
  styleUrls: ['./comp1.component.scss']
})
export class Comp1Component implements OnInit {

  // @Autowired
  // private BookSErvice service;



  constructor(public service:BookService) { 
  }

  ngOnInit(): void {
  }

  changeAuthor(author:string){
    var book:Book = this.service.book; // using getter in javascript
    book.author = author;
    book.title = "Ironman is in water";
    this.service.book = book; // using setter in javascript
  }

}

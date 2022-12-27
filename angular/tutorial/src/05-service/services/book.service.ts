import { Injectable } from "@angular/core";
import { Book } from "./../book";

@Injectable({"providedIn": "root"})
export class BookService{

    private obj = {
        mybook: {
            title: "First book",
            author: "Mike",
            price: 24
        }
    }

    // public doTask(){
    //     console.log("doing task");
    // }

    public set book(b:Book){
        this.obj.mybook = b;
    }

    public get book():Book{
        return this.obj.mybook;
    }
}
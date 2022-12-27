package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // List<Movie> findAll();
    // Movie findById(int id);
    // Movie save(Movie m);
    // Movie delete(int id);
}


// interface MyRepository<T, P>{
//     List<T> findAll();
//     T findById(P id);
//     T save(T m);
//     T delete(P id);
// }

// class MyDemoRepository implements MyRepository<Object, String>{

//     @Override
//     public List<Object> findAll() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Object findById(String id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Object save(Object m) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Object delete(String id) {
//         // TODO Auto-generated method stub
//         return null;
//     }}


// class MyMovieRepository implements MyRepository<Movie, Integer>{

//     @Override
//     public List<Movie> findAll() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Movie findById(Integer id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Movie save(Movie m) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Movie delete(Integer id) {
//         // TODO Auto-generated method stub
//         return null;
//     }
    
// }

// // class BookRepository {
// //     List<Book> findAll();
// //     Book findById(int id);
// //     Book save(Book m);
// //     Book delete(int id);
// // }

// // class PaymentRepository {
// //     List<Payment> findAll();
// //     Payment findById(String id);
// //     Payment save(Payment m);
// //     Payment delete(String id);
// // }


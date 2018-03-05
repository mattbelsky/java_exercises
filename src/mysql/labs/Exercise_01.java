package mysql.labs;

/**
 * MySQL Exercise 1:
 *
 *      1.) Import the sakila-db schema and data using the MySQLWorkbench
 *      2.) Execute the following queries and paste the results to make sure the data is imported correctly:
 *          a. SELECT * FROM sakila.actor;
 *          b. SELECT * FROM sakila.actor WHERE first_name = "JULIA";
 *      3.) Write and execute several other select statements with various WHERE clauses
 *      4.) Use a join query to select all actors in the film of your choice
 *      select a.first_name, a.last_name
         from sakila.actor a
         join sakila.film_actor fa
         on a.actor_id = fa.actor_id
         join sakila.film f
         on f.film_id = fa.film_id
         where f.title = "ACADEMY DINOSAUR";
 *
 *      5.) Use a join query to select all the films in the category of your choice that was released before 2006
 *      select * from sakila.film f
         join sakila.film_category fc
         on fc.film_id = f.film_id
         join sakila.category c
         on fc.category_id = c.category_id
         where c.category_id = 3 and f.release_year < 2006;
 *
 *      6.) Create a backup dump file using MySQLWorkbench.
 *
 */


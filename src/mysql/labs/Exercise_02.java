package mysql.labs;

/**
 *
 * MySQL Exercise 2:
 *
 *      Using MySQLWorkbench,
 *
 *      1.) Create a new database "coding_school"
 *      2.) Create a new table "students" with the following fields:
 *          a. id (auto increment)
 *          b. first_name
 *          c. age
 *
 *      3.) Create a new table "teachers_students" with the following fields:
 *          a. id (auto increment)
 *          b. student_id
 *          c. teacher_id
 *
 *      4.) Create a new table "teachers" with the following fields:
 *          a. id (auto increment)
 *          b. first_name
 *          c. last_name
 *          d. subject
 *
 *      5.) Populate each table with at least 5 records.
 *
 *      6.) Write queries (and paste them below) for each of the following tasks:
 *          a. select all students
 *          select * from coding_school.students;
 *
 *          b. select all teacher how teach "Math" (choose a subject you included)
 *          select * from coding_school.teachers where subject = "math";
 *
 *          c. use a join query to select all students with a certain teacher
 *          select s.first_name
             from coding_school.students s
             join coding_school.teachers_students ts
             on s.id = ts.student_id
             where ts.teacher_id = 1;
 *
 *          d. use a join query to select all students with taking a certain subject
 *          select s.first_name
             from coding_school.students s
             join coding_school.teachers_students ts
             on s.id = ts.student_id
             join coding_school.teachers t
             on t.id = ts.teacher_id
             where t.subject = "math";
 *
 *          e. update a record in the student table
 *          update coding_school.students set first_name = "Margaret" where id = 2;
 *
 *          f. add a record to the teacher table
 *          insert into coding_school.teachers (first_name, last_name, subject) values ("Max", "Christmas", "english");
 *
 *       7.) Export the schema to a dump file and copy it to this folder.
 *
 *
 */
-- CREATE AND USE COLLEGE DATABASE

CREATE DATABASE college;
USE college;

-- CREATE TABLE : -

    CREATE TABLE student (
    rollno INT PRIMARY KEY,
    name VARCHAR(50)
    );

-- INSERT : -
INSERT INTO student
(rollno, name)
VALUES
(101, "Karan"),
(102, "Arjun");

-- SELECT & VIEW ALL COLUMNS : -
SELECT * FROM Student;

-- ALTER TABLE : -
ALTER TABLE student
    ADD COLUMN marks INT NOT NULL,
    ADD COLUMN grade VARCHAR(1),
    ADD COLUMN city VARCHAR(20);


-- This query retrieves the TABLE_NAME and COLUMN_NAME from the information_schema.COLUMNS view. 
-- This view provides information about all columns in your database.
SELECT TABLE_NAME, COLUMN_NAME
FROM information_schema.COLUMNS;


-- INSERT INFO INTO STUDENT : -
INSERT INTO student
(rollno, name, marks, grade, city)
VALUES
(101, "anil", 78, "C", "Pune"),
(102, "bhumika", 93, "A", "Mumbai"),
(103, "chetan", 85, "B", "Mumbai"),
(104, "dhruv", 96, "A", "Delhi"),
(105, "emanuel", 12, "F", "Delhi"),
(106, "farah", 82, "B", "Delhi");

-- SELECT in Detail : -
SELECT rollno, name FROM student;

-- SELECT ALL : -
SELECT * FROM student;

-- WHERE CLAUSE : -
SELECT * FROM student WHERE marks > 80;
SELECT * FROM student WHERE city = "Mumbai";

-- OPERATORS : -

-- AND : 

    SELECT * FROM student WHERE marks > 20 AND city = "Mumbai";

    -- OR : 
    SELECT * FROM student WHERE marks > 20 OR city = "Mumbai";

    -- BETWEEN : 
    SELECT * FROM student WHERE marks BETWEEN 80 AND 90;

    -- IN : 
    SELECT * FROM student WHERE city IN ("Delhi","Mumbai");

    -- NOT IN : 
    SELECT * FROM student WHERE city NOT IN ("Delhi", "Mumbai");

    -- LIMIT CLAUSE : 
    SELECT * FROM student LIMIT 3;

    -- ORDER BY CLAUSE : 
    SELECT * FROM student ORDER BY city ASC;
    SELECT * FROM student ORDER BY city DESC;

-- AGGREGATE FUNCTIONS : -

    -- MAX :
    SELECT max(marks) FROM student;

    -- MIN : 
    SELECT min(marks) FROM student;

    -- SUM : 
    SELECT sum(marks) FROM student;

    -- AVG : 
    SELECT avg(marks) FROM student;

    -- COUNT : 
    SELECT count(name) FROM student;

-- GROUP BY CLAUSE : -

    SELECT city, count(name)
    FROM student
    GROUP BY city;

-- HAVING CLAUSE : -
    -- Count number of students in each city where max marks cross 90.

    SELECT count(name), city
    FROM student
    GROUP BY city
    HAVING max(marks) > 90;

-- TABLE RELATED QUERIES : -
    -- UPDATE : 
    UPDATE student
    SET grade = "O"
    WHERE grade = "A";

    -- DELETE : 
    DELETE FROM student
    WHERE marks < 33;

    -- ALTER :
        -- 1) ADD Column :-
        ALTER TABLE student
        ADD COLUMN age INT NOT NULL DEFAULT 19;

        -- 2) MODIFY : -
        ALTER TABLE student
        MODIFY age VARCHtAR(2);

        -- 3) CHANGE(rename) : -
        ALTER TABLE student
        CHANGE age stu_age INT;

        -- 4) DROP Column : -
        ALTER TABLE student
        DROP COLUMN stu_age;

        -- 5) RENAME Table : -
        ALTER TABLE student
        RENAME TO stu;

    -- TRUNCATE : 
    TRUNCATE TABLE stu;

-- ************* JOINS **************** --

    CREATE TABLE student(
        student_id INT PRIMARY KEY,
        name VARCHAR(10)
    );

    INSERT INTO student (student_id, name)
    VALUES
    (101, "adam"),
    (102, "bob"),
    (103, "casey");

    --     +------------+-------+
    -- | student_id | name  |
    -- +------------+-------+
    -- |        101 | adam  |
    -- |        102 | bob   |
    -- |        103 | casey |
    -- +------------+-------+

    CREATE TABLE course(
        student_id INT PRIMARY KEY,
        course VARCHAR(10)
    );

    INSERT INTO course (student_id, course) 
    VALUES
    (102, "english"),
    (105, "math"),
    (103, "science"),
    (107, "computer science");

    --     +------------+------------------+
    -- | student_id | course           |
    -- +------------+------------------+
    -- |        102 | english          |
    -- |        103 | science          |
    -- |        105 | math             |
    -- |        107 | computer science |
    -- +------------+------------------+


    -- INNER JOIN : -
    SELECT * 
    FROM student
    INNER JOIN course
    ON student.student_id = course.student_id;

    --     +------------+-------+------------+---------+
    -- | student_id | name  | student_id | course  |
    -- +------------+-------+------------+---------+
    -- |        102 | bob   |        102 | english |
    -- |        103 | casey |        103 | science |
    -- +------------+-------+------------+---------+

    -- LEFT JOIN : -
    SELECT *
    FROM student
    LEFT JOIN course
    ON student.student_id = course.student_id;

    --     +------------+-------+------------+---------+
    -- | student_id | name  | student_id | course  |
    -- +------------+-------+------------+---------+
    -- |        101 | adam  |       NULL | NULL    |
    -- |        102 | bob   |        102 | english |
    -- |        103 | casey |        103 | science |
    -- +------------+-------+------------+---------+

    -- RIGHT JOIN : -
    SELECT *
    FROM student
    RIGHT JOIN course
    ON student.student_id = course.student_id;

    --     +------------+-------+------------+------------------+
    -- | student_id | name  | student_id | course           |
    -- +------------+-------+------------+------------------+
    -- |        102 | bob   |        102 | english          |
    -- |        103 | casey |        103 | science          |
    -- |       NULL | NULL  |        105 | math             |
    -- |       NULL | NULL  |        107 | computer science |
    -- +------------+-------+------------+------------------+

    -- FULL JOIN : -
    SELECT *
    FROM student AS s
    LEFT JOIN course AS c
    ON s.student_id = c.student_id

    UNION

    SELECT *
    FROM student AS s
    RIGHT JOIN course AS c
    ON s.student_id = c.student_id;

    --     +------------+-------+------------+------------------+
    -- | student_id | name  | student_id | course           |
    -- +------------+-------+------------+------------------+
    -- |        101 | adam  |       NULL | NULL             |
    -- |        102 | bob   |        102 | english          |
    -- |        103 | casey |        103 | science          |
    -- |       NULL | NULL  |        105 | math             |
    -- |       NULL | NULL  |        107 | computer science |
    -- +------------+-------+------------+------------------+

    -- LEFT EXCLUSIVE JOIN --
    SELECT * 
    FROM student AS s
    LEFT JOIN course AS c
    ON s.student_id = c.student_id
    WHERE c.student_id IS NULL;

    -- +------------+------+------------+--------+
    -- | student_id | name | student_id | course |
    -- +------------+------+------------+--------+
    -- |        101 | adam |       NULL | NULL   |
    -- +------------+------+------------+--------+
    
    -- RIGHT EXCLUSIVE JOIN --
    SELECT *
    FROM student AS s
    RIGHT JOIN course AS c
    ON s.student_id = c.student_id
    WHERE s.student_id IS NULL;

    --     +------------+------+------------+------------------+
    -- | student_id | name | student_id | course           |
    -- +------------+------+------------+------------------+
    -- |       NULL | NULL |        105 | math             |
    -- |       NULL | NULL |        107 | computer science |
    -- +------------+------+------------+------------------+



















    
    
    






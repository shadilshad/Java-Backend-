INSERT INTO students VALUES
(1, 'Alex', 'alex@gmail.com', 20, 'CSE'),
(2, 'Brian', 'brian@gmail.com', 21, 'ECE'),
(3, 'Cathy', 'cathy@gmail.com', 19, 'CSE'),
(4, 'David', 'david@gmail.com', 22, 'MECH');

INSERT INTO courses VALUES
(101, 'Data Structures', 4),
(102, 'Databases', 3),
(103, 'Operating Systems', 4);

INSERT INTO enrollments VALUES
(1, 1, 101, 'SEM5', 'A'),
(2, 1, 102, 'SEM5', 'B'),
(3, 2, 102, 'SEM5', 'A'),
(4, 3, 101, 'SEM5', 'A'),
(5, 4, 103, 'SEM5', 'C');

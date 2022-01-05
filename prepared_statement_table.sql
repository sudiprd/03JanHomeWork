use stexample;

CREATE TABLE stexample (
	emp_no int(11) not null auto_increment primary key,
    emp_name varchar(60) not null,
    email varchar(60) not null,
    salary double default null
);
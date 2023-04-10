create table course(
  id bigint not null,
  name varchar(255) not null,
  author varchar(255) not null,
  primary key (id)
);


INSERT INTO course (id, name, author) VALUES (1, 'AWS', 'JOHN SMITH');
INSERT INTO course (id, name, author) VALUES (2, 'JAVA 11', 'JOHN SMITH');
INSERT INTO course (id, name, author) VALUES (3, 'SPRING MVC', 'PETER JOHNSON');

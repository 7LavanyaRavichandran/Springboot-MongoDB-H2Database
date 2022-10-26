DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(200) NOT NULL,
phoneNo INT NOT NULL ,
mailID VARCHAR(200) NOT NULL,
salary INT NOT NULL,
BaseLocation VARCHAR(250)
);

INSERT INTO Employee (name,PhoneNo,mailID,salary,BaseLocation) VALUES 
('Lavanya',21873,'l.r1@nmail',600000,'Chennai'),
('ELamaran',2187,'l.r1@nmail',600000,'Chennai');

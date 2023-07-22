CREATE TABLE employee (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_name VARCHAR(20),
    duty VARCHAR(30),
    manager_id INT,
    FOREIGN KEY (manager_id) REFERENCES employee(employee_id)
);
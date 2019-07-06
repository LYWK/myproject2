
DROP TABLE IF EXISTS cycles;
CREATE TABLE cycles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    model_name VARCHAR(15) UNIQUE NOT NULL,
    sort VARCHAR(15) NOT NULL,
    price VARCHAR(50) NOT NULL,
    brand VARCHAR(50) NOT NULL,
    gear VARCHAR(50) NOT NULL,
    rent VARCHAR(110) NOT NULL,
    )DEFAULT CHARSET=utf8;
commit;
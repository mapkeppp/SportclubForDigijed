DROP TABLE IF EXISTS training_session;
DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS trainer;
DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS role;

CREATE TABLE trainer (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         category VARCHAR(100) NOT NULL,
                         experience_years INT NOT NULL
);

CREATE TABLE member (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        membership_type VARCHAR(100) NOT NULL,
                        join_date DATE NOT NULL
);

CREATE TABLE training_session (
                                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                  trainer_id BIGINT NOT NULL,
                                  member_id BIGINT NOT NULL,
                                  date_time TIMESTAMP NOT NULL,
                                  duration INT NOT NULL,
                                  FOREIGN KEY (trainer_id) REFERENCES trainer(id) ON DELETE CASCADE,
                                  FOREIGN KEY (member_id) REFERENCES member(id) ON DELETE CASCADE
);

CREATE TABLE role (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL
);

CREATE TABLE user_roles (
                            user_id BIGINT NOT NULL,
                            role_id BIGINT NOT NULL,
                            FOREIGN KEY (user_id) REFERENCES users(id),
                            FOREIGN KEY (role_id) REFERENCES role(id),
                            PRIMARY KEY (user_id, role_id)
);

INSERT INTO role (name) VALUES ('ROLE_USER');
INSERT INTO role (name) VALUES ('ROLE_ADMIN');

INSERT INTO trainer (name, category, experience_years) VALUES
                                                           ('Іван Іванов', 'Фітнес', 5),
                                                           ('Олена Петрова', 'Йога', 7);

INSERT INTO member (name, membership_type, join_date) VALUES
                                                          ('Андрій Коваль', 'Premium', '2023-01-15'),
                                                          ('Марія Литвин', 'Standard', '2024-03-12');

use CINEMA;
create table film(
id int primary key,
titre varchar (50),
duree int,
categorie varchar (80));

create table seance (
id int primary key auto_increment,
film_id int,
horaire datetime,
salle varchar(15),
capacite_max int,
foreign key (film_id) references film(id)
);
CREATE TABLE Spectateur (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100),
    email VARCHAR(100)
);
CREATE TABLE Ticket (
    numero INT PRIMARY KEY AUTO_INCREMENT,
    seance_id INT,
    spectateur_id INT,
    prix DECIMAL(6,2),
    FOREIGN KEY (seance_id) REFERENCES Seance(id),
    FOREIGN KEY (spectateur_id) REFERENCES Spectateur(id)
);

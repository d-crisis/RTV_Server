USE rtv_db;
CREATE TABLE sud_america (
  id serial NOT NULL,
  nome varchar(20),
  latitude double NOT NULL,
  longitude double NOT NULL,
  PRIMARY KEY(id)
);


INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Bogota',4.624335,-74.063644);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Cayenne',4.93333,-52.333331);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('La Paz',-16.5,-68.15);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Georgetown',6.80448,-58.15527);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Montevideo',-34.901112,-56.164532);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Tegucigalpa',14.0818,-87.20681);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Rio Gallegos',-51.62261,-69.21813);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Ansuncion',-25.30066,-57.63591);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Santiago',-33.447487,-70.673676);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Buenos Aires',-34.603722,-58.381592);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Rio Branco',-9.97472,-67.81);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Brasilia',-15.77972,-47.92972);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Quito',-0.180653,-78.467834);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Rio de Janeiro',-22.911,-43.2094);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Caracas',10.500000,-66.916664);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Lima',-12.046374,-77.042793);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Panama',8.983333,-79.516670);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('San Jose',9.934739,-84.087502);
INSERT INTO sud_america(nome, latitude, longitude) VALUES ('Teresina',-5.08917,-42.80194);
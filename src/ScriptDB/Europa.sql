USE rtv_db;
CREATE TABLE europa (
  id serial NOT NULL,
  nome varchar(20),
  latitude double NOT NULL,
  longitude double NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO europa(nome, latitude, longitude) VALUES ('Milan',45.4642035,9.189981999999986);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Paris',48.856614,2.3522219000000177);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Madrid',40.4167754,-3.7037901999999576);
INSERT INTO europa(nome, latitude, longitude) VALUES ('London',51.5073509,-0.12775829999998223);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Minsk',53.90453979999999,27.561524400000053);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Brussels',50.8503463,4.351721099999963);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Rome',41.9027835,12.496365500000024);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Riga',56.9496487,24.105186499999945);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Zagreb',45.8150108,15.981918899999982);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Berlin',52.52000659999999,13.404953999999975);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Stockholm',59.32932349999999,18.068580800000063);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Athens',37.9838096,23.727538800000048);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Dublin',53.3498053,-6.260309699999993);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Lisbon',38.7222524,-9.139336599999979);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Kiev',50.4501,30.523400000000038);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Oslo',59.9138688,10.752245399999993);
INSERT INTO europa(nome, latitude, longitude) VALUES ('Amsterdam',52.3702157,4.895167899999933);
-- create table

CREATE TABLE Jaegers (

	id 			SERIAL PRIMARY KEY,
	model_name 	VARCHAR(20),
	mark 		VARCHAR(10),
	height 		DOUBLE PRECISION,
	weight 		DOUBLE PRECISION,
	status 		VARCHAR(9),
	origin 		VARCHAR(20),
	launch 		DATE,
	kaiju_kill 	INTEGER)
;
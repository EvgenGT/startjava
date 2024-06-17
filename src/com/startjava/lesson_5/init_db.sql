-- create database

CREATE TABLE robots (
	id 			SERIAL PRIMARY KEY,
	modelName 	TEXT,
	mark		TEXT,
	height		INTEGER,
	weight		INTEGER,
	status		TEXT,
	origin		TEXT,
	launch		CHAR(4),
	kaijuKill	INTEGER
);
CREATE TABLE IF NOT EXISTS Dashboard(id IDENTITY PRIMARY KEY, done BOOLEAN, text VARCHAR(255));
DELETE FROM Dashboard;
INSERT INTO Dashboard VALUES(1, true, 'Prepare presentation');
INSERT INTO Dashboard VALUES(2, true, 'Procrastinate');
INSERT INTO Dashboard VALUES(3, false, 'Have presentation');
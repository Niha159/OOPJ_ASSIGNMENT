CREATE TABLE IF NOT EXISTS CollegeFees (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    Branch VARCHAR(255),
    CurrentYear VARCHAR(255),
    Management BIGINT,
    KEA BIGINT,
    SNQ BIGINT,
    AdditionalFees BIGINT
);

INSERT INTO CollegeFees (Branch, CurrentYear, Management, KEA, SNQ, AdditionalFees)
VALUES
 ('Computer Science', '1st', 210720, 107625, 30720, 12720),
  ('Computer Science', '2nd', 200720, 104625, 30720, 2720),
  ('Computer Science', '3rd', 180720, 96060, 30720, 2720),
  ('Computer Science', '4th', 170720, 95625, 30720, 2720),
  ('AI-DS or AI-ML', '1st', 190720, 107625, 30720, 12720),
  ('AI-DS or AI-ML', '2nd', 150720, 104625, 30720, 2720),
  ('AI-DS or AI-ML', '3rd', 115720, 96060, 30720, 2720),
  ('AI-DS or AI-ML', '4th', 105720, 95625, 30720, 2720), 
  ('Electronics', '1st', 150720, 107625, 30720, 12720),
  ('Electronics', '2nd', 140720, 104625, 30720, 2720),
  ('Electronics',' 3rd', 115720, 96060, 30720, 2720),
  ('Electronics',' 4th', 105720, 95625, 30720, 2720),
  ('Mechanical', '1st', 80720, 107625, 30720, 12720),
  ('Mechanical', '2nd', 90720, 104625, 30720, 2720),
  ('Mechanical', '3rd', 100720, 96060, 30720, 2720),
  ('Mechanical', '4th', 100720, 95625, 30720, 2720),
  ('Civil', '1st', 80720, 107625, 30720, 12720),
  ('Civil', '2nd', 90720, 104625, 30720, 2720),
  ('Civil', '3rd', 100720, 96060, 30720, 2720),
  ('Civil', '4th', 100720, 95625, 30720, 2720);
SELECT * FROM CollegeFees;
drop table CollegeFees; 
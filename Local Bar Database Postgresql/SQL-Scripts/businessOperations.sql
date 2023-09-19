UPDATE bars
SET age = 22
WHERE barID = 1;

SELECT AVG(age) AS avgAge
FROM bars;

INSERT INTO bars(barID, barName, age, themeID)
VALUES(7, 'tips', 34, 3);

UPDATE barrating
SET rating = 5
WHERE ratingid = 2;

SELECT AVG(rating) AS avgRating
FROM barrating;


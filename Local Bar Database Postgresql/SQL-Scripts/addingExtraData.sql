--barID = 7 (so 8 is next)
--barRatingID = 7 (so 8 is next)

--adds bars and the corresponding addresses
INSERT INTO bars(barID, barName, age, themeID)
VALUES(8, 'The Beach', 24, 3);

INSERT INTO barLocation(locationID, barID, locationName)
VALUES(7, 8, '227 Bourbon St, New Orleans, LA 70130');

INSERT INTO bars(barID, barName, age, themeID)
VALUES(9, 'The Gilded Perch', 40, 5);

INSERT INTO barLocation(locationID, barID, locationName)
VALUES(8, 9, '7004 St Charles Ave, New Orleans, LA 70118');

INSERT INTO bars(barID, barName, age, themeID)
VALUES(10, 'Monkey Hill Bar', 32, 5);

INSERT INTO barLocation(locationID, barID, locationName)
VALUES(9, 10, '6100 Magazine St, New Orleans, LA 70118');

INSERT INTO bars(barID, barName, age, themeID)
VALUES(11, 'Cure', 36, 2);

INSERT INTO barLocation(locationID, barID, locationName)
VALUES(10, 11, '4905 Freret St, New Orleans, LA 70115');

INSERT INTO bars(barID, barName, age, themeID)
VALUES(12, 'Le Bon Temps Roule', 43, 5);

INSERT INTO barLocation(locationID, barID, locationName)
VALUES(11, 12, '4801 Magazine St, New Orleans, LA 70115');
--bar rating
INSERT INTO barRating (ratingID, barID, rating, review)
VALUES(8, 9, 7, 'Ok ambiance');

INSERT INTO barRating (ratingID, barID, rating, review)
VALUES(9, 8, 10, 'Wonderful');

INSERT INTO barRating (ratingID, barID, rating, review)
VALUES(10, 5, 5, 'Really not great');

INSERT INTO barRating (ratingID, barID, rating, review)
VALUES(11, 12, 10, 'Good food');
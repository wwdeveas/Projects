--script for adding to the tables
TRUNCATE TABLE bars, barTheme, barLocation, barRating, deals, schedule;

INSERT INTO bartheme (themeID, theme)
VALUES
    (1, 'college'),
    (2, 'generic'),
    (3, 'club'),
    (4, 'dive'),
    (5, 'bar/resturaunt'),
    (6, 'Sports');

INSERT INTO bars (barID, barName, age, themeID)
VALUES 
    (1, 'The Boot', 21, 1),
    (2, 'TJ Quills', 25, 2),
    (3, 'The Palms', 30, 3),
    (4, 'Snake and Jakes', 35, 4),
    (5, 'Brunos Tavern', 23, 5),
    (6, 'Redds Uptility Tavern', 32, 6);


INSERT INTO barlocation (locationID, barID, locationName)
VALUES
    (1, 1, '1039 Broadway St, New Orleans, LA 70118'),
    (2, 2, '7600 Maple St, New Orleans, LA 70118'),
    (3, 3, '7130 Freret St, New Orleans, LA 70118'),
    (4, 4, '7612 Oak St, New Orleans, LA 70118'),
    (5, 5, '7538 Maple St, New Orleans, LA 70118'),
    (6, 6, '7601 Maple St, New Orleans, LA 70118');

INSERT INTO barRating (ratingID, barID, rating, review)
VALUES
    (1, 1, 9, 'Very good, everyone was nice'),
    (2, 2, 8, 'Good Drinks'),
    (3, 3, 10, 'Liked the atmosphere'),
    (4, 4, 7, 'Was a fun time'),
    (5, 5, 10, 'Fun with friends'),
    (6, 6, 5, 'Staff was not the best');

INSERT INTO deals (dealID, dealDescription, dealPrice)
VALUES
    (1, '2 for 1 beers', 5),
    (2, 'Gin Night', 7),
    (3, 'Half Doubles', 10);

INSERT INTO schedule (scheduleID, barID, dealID, dayOfTheWeek)
VALUES  
    (1, 2, 2, 'Monday'),
    (2, 5, 1, 'Wednesday'),
    (3, 1, 3, 'Friday');

SELECT * FROM bars;
SELECT * FROM bartheme;
SELECT * FROM barlocation;
SELECT * FROM barrating;
SELECT * FROM deals;
SELECT * FROM schedule;
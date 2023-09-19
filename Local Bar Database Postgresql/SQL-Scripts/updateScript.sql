--The update script works by using the insert function to give the parameters of the table
--then you use the values to add the actual data
--next you take use "ON CONFLICT" incase there is conflicting data
--You would run this script to add a bar to the bars table
INSERT INTO barRating (ratingID, barID, rating, review)
VALUES (7, 3, 10, 'Great bar!')
ON CONFLICT (ratingID) DO UPDATE
SET rating = EXCLUDED.rating,
    review = EXCLUDED.review;

SELECT * FROM barrating;

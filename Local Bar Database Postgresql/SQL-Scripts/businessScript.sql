--script for business script


--It is important for the information to be sorted in any way.
--In this instance I selected the bars and barTheme table to come 
--together and show how each age (age references the prefered age of the bar patrons) applies to the bars corresponding theme, as to make it more marketable based off of demographic
SELECT b.barID, b.barName, b.age, t.themeID, t.theme
FROM bars b 
JOIN bartheme t ON b.themeID = t.themeID
ORDER BY b.themeid DESC;

--Similarly I took the general bar information and combined it with the ratings.
--I also ordered it so the highest rated bars would appear first like with any review application.
SELECT b.barID, b.barName, b.age, b.themeID, r.ratingID, r.rating, r.review
FROM bars b 
JOIN barrating r ON b.barID = r.barID
ORDER BY r.rating DESC;

--add 4 more


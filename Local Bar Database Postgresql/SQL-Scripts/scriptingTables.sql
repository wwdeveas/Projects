--script for creating the tables
DROP TABLE IF EXISTS bars, barTheme, barLocation, barRating, deals, schedule;
CREATE TABLE barTheme (
    themeID INT PRIMARY KEY,
    theme VARCHAR(100)
);

CREATE TABLE bars (
    barID INT PRIMARY KEY,
    barName VARCHAR(100),
    age INT,
    themeID INT REFERENCES barTheme(themeID)
);

CREATE TABLE barLocation (
    locationID INT PRIMARY KEY,
    barID INT REFERENCES bars(barID),
    locationName VARCHAR(500)
);

CREATE TABLE barRating (
    ratingID INT PRIMARY KEY,
    barID INT REFERENCES bars(barID),
    rating INT,
    review VARCHAR(750)
);

CREATE TABLE deals (
    dealID INT PRIMARY KEY,
    dealDescription VARCHAR(500),
    dealPrice INT
);

CREATE TABLE schedule (
    scheduleID INT PRIMARY KEY,
    barID INT REFERENCES bars(barID),
    dealID INT REFERENCES deals(dealID),
    dayOfTheWeek VARCHAR(10)
);
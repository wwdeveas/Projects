CREATE OR REPLACE FUNCTION insertBar(
    vBarID INT,
    vBarName VARCHAR(100),
    vBarAge INT,
    vBarThemeID INT
)
RETURNS VOID AS
$$
BEGIN
    INSERT INTO bars(barID, barName, age, themeID)
    VALUES (vBarID, vBarName, vBarAge, vBarThemeID);
END;
$$
LANGUAGE plpgsql;

SELECT insertBar(8, 'King Pin', 33, 5);

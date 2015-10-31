-- https://codility.com/programmers/task/sql_segments_sum
-- https://codility.com/demo/results/trainingZTHREF-SVK/
SELECT
    + (
        SELECT COALESCE(SUM(r), 0)
        FROM
        (
            SELECT DISTINCT rightTrailing.r
            FROM segments rightTrailing
            WHERE rightTrailing.r NOT IN (
                SELECT innerRight.r
                FROM segments bound, segments innerRight
                WHERE
                    innerRight.r >= bound.l
                    AND innerRight.r < bound.r
            )
        )
    )
    - (
        SELECT COALESCE(SUM(l), 0)
        FROM
        (
            SELECT DISTINCT leftTrailing.l
            FROM segments leftTrailing
            WHERE leftTrailing.l NOT IN (
                SELECT innerLeft.l
                FROM segments bound, segments innerLeft
                WHERE
                    innerLeft.l > bound.l
                    AND innerLeft.l <= bound.r
            )
        )
    )

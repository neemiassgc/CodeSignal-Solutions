def triangleExistence(sides)
    s1, s2, s3 = sides[0] + sides[1], sides[1] + sides[2], sides[0] + sides[2];
    return (s1 > sides[2] && s2 > sides[0] && s3 > sides[1]);
end
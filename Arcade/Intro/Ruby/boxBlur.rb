def boxBlur(image)
    h, w = image.size - 2, image[0].size - 2
    sum = Array.new(h) {Array.new(w,[])}
    (1..h).each do |i|
        (1..w).each do |j|
            c =
                image[i-1][j-1]+image[i-1][j]+image[i-1][j+1]+
                image[i][j-1]+image[i][j]+image[i][j+1]+
                image[i+1][j-1]+image[i+1][j]+image[i+1][j+1]
            sum[i-1][j-1] = c / 9
        end
    end
    return sum
end
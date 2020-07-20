def longestWord(text)
    return text.gsub(/[^a-zA-Z ]/, " ")
    .split(/ /).sort{|a, b| b.size <=> a.size}[0]
end
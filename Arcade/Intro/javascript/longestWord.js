function longestWord(text) {
    return text.replace(/[^a-zA-Z]/g, " ")
    .split(" ").reduce((v, c) => c = v.length > c.length ? v : c);
}
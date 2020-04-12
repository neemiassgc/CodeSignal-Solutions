function reverseVowelsOfString(s) {
    let out = "", vowels = "";

    for(let ch of s) {
        if(ch.match(/[aeiou]/i) == ch) {
            let ss = ch+vowels;
            vowels = ss;
        }
    }

    for(let i = 0, x = 0; i < s.length; i++) {
        let ch = s.charAt(i);
        if(ch.match(/[aeiou]/i) == ch) {
            out += vowels[x];
            x++;
            continue;
        }
        out += ch;
    }
    return out;
}
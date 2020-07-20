function checkPalindrome(string) {
    let str = ""
    for(let i = string.length; i >= 0; i--) str += string.charAt(i);
    return str === string;
}
function pagesNumberingWithInk(current, numberOfDigits) {
    while (numberOfDigits >= (current+"").length)
        numberOfDigits -= ((current++)+"").length
        
    return current - 1;
}
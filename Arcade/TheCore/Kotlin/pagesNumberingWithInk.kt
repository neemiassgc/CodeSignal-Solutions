fun pagesNumberingWithInk(current: Int, numberOfDigits: Int): Int {
    var lastPage: Int = current;
    var ink: Int = numberOfDigits;
    
    while (ink >= (""+lastPage).length)
        ink -= (""+lastPage++).length
        
    return lastPage - 1;
}
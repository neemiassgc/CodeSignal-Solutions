final class PagesNumberingWithInk {
    
    int pagesNumberingWithInk(int current, int numberOfDigits) {
        while(numberOfDigits >= (current+"").length())
            numberOfDigits -= ((current++)+"").length();
            
        return current - 1;
    }
}
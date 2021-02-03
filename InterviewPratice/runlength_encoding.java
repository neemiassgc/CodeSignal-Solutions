public static String encoding(String inputStream) {
  int n = inputStream.length();
  StringBuilder output = new StringBuilder()
  for (int = 0; i < n; i++) {
    int count = 1;
    while (i < n - 1 && inputStream.charAt(i) == inputStream.charAt(i + 1)) {
      count ++;
      index ++;
    }
    output.append(count);
    output.append(inputStream.charAt(i));
    
  }
  return output.toString();
}
    
    
    

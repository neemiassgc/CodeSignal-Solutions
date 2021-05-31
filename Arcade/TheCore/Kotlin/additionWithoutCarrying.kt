fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var p1: String = param1.toString();
    var p2: String = param2.toString();
    val len: Int = Math.max(p1.length, p2.length);
    var result: String = "";
    
    p1 = "0".repeat(len - p1.length) + p1;
    p2 = "0".repeat(len - p2.length) + p2;
    
    (len - 1 downTo 0).forEach {
        result = (p1[it].toString().toInt() + p2[it].toString().toInt())
            .toString().last().toString() + result;
    }
    
    return result.toInt();
}
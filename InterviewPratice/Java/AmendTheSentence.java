final class AmendTheSenteance {

    String amendTheSentence(String s) {
        String output = "";
        for(String x : s.split("(?=[A-Z])")) {
            output += x+" ";
        }
        return output.trim().toLowerCase();
    }
}
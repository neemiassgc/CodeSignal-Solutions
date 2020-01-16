public final class Lrc2subRip {

	String formatConverter(String str) {
		String[] v = str.replace('.', ':').split(":");
		String hh = "00", mm = v[0];
		int tmp = Integer.valueOf(mm).intValue();
		if(tmp - 60 >= 0) {
			hh = "01";
			tmp -= 60;
			mm = (tmp < 10) ? "0"+tmp+"" : tmp+"";
		}
		return hh+":"+mm+":"+v[1]+","+v[2]+"0";
	}

	String[] lrc2subRip(String[] lrcLyrics, String songLength) {
	    int len = lrcLyrics.length;
	    String[] times = new String[len];
	    String[] lyrics = new String[len];
	    ArrayList<String> output =  new ArrayList();
	    songLength = songLength+",000";
	    for(int i = 0; i < len; i++) {
	        times[i] = lyrics[i] = "";
	        for(char ch : lrcLyrics[i].toCharArray()) {
	            if(ch != '[') {
	                if(ch == ']') { break; }
	                else { times[i] += ch+""; }
	            }
	        }
	        times[i] = formatConverter(times[i]);
	        int k = -1;
	        for(char c : lrcLyrics[i].toCharArray()) {
	            if(k == 0) { lyrics[i] += c+""; }
	            if(c == ' ') { k = 0; }
	        }
	    }
	    for(int i = 0; i < len; i++) {
	        output.add((i + 1)+"");
	        output.add(times[i]+" --> "+((i != len - 1) ? times[i + 1] : songLength));
	        output.add(lyrics[i]);
	        if(i != len - 1) { output.add(""); }
	    }
	    return output.toArray(new String[output.size()]);
	}
}
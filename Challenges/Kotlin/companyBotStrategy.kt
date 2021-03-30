fun companyBotStrategy(trainingData: MutableList<MutableList<Int>>): Double {
	var q: Int = 0
	var sum: Double = .0

	for (data: MutableList<Int> in trainingData) {
	  if (data[1] == 1) {
	      q++
	      sum += data[0]
	  }
	}

	return if (q > 0) sum / q else .0
}
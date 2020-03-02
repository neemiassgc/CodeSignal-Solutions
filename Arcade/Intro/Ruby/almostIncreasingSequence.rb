def almostIncreasingSequence(sequence)
	isIncreasing = ->(seq) do
		(1...seq.size).each do |s|
			return false if seq[s] <= seq[s - 1]
		end
		return true
	end
	(0...sequence.size).each do |i|
		arr = []
		for v in (0...sequence.size) do
			arr.push(sequence[v]) if v != i
		end
		return true if isIncreasing.call arr
	end
	return false
end
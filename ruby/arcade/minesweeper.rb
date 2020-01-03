def minesweeper(matrix)
	w, h = matrix[0].size, matrix.size
	board = Array.new(h, Array.new(w, 0))
	h.times { |i| w.times { |j| board[i][j] = 0 } }
	h.times do |r|
		w.times do |c|
			board[r][c] += (matrix[r - 1][c - 1]) ? 1 : 0
			board[r][c] += (matrix[r - 1][c]) ? 1 : 0
			board[r][c] += (matrix[r - 1][c + 1]) ? 1 : 0
			board[r][c] += (matrix[r][c - 1]) ? 1 : 0
			board[r][c] += (matrix[r][c + 1]) ? 1 : 0
			board[r][c] += (matrix[r + 1][c - 1]) ? 1 : 0
			board[r][c] += (matrix[r + 1][c]) ? 1 : 0
			board[r][c] += (matrix[r + 1][c + 1]) ? 1 : 0
		end
	end
	return board
end
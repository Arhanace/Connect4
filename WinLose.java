
public class WinLose {
	public boolean checkwinnerPlayer1() {
		if (checkhoriz1() == true || checkdiagfwd1() == false || checkvert1() == true || checkdiagback1() == false)
			return true;
		else
			return false;
	}

	public boolean checkwinnerPlayer2() {
		if (checkhoriz2() == true || checkdiagfwd2() == false || checkvert2() == true || checkdiagback2() == false)
			return true;
		else
			return false;
	}

	public boolean checkhoriz1() {

		boolean flag = false;// creates boolean to act as flag

		int counter = 0;// creates counter
		while (flag) {// goes through board horizontally

			for (int w = 0; 7 > w; w += 1) {
				for (int h = 0; 6 > h; h += 1) {
					if (BoardPrinter.board[w][h] == 'X') { // if it finds an X, add 1 to
												// counter
						counter += 1;
					} else {
						counter = 0; // if next piece is not an X, set counter
										// to 0
					}
					if (counter >= 4) {
						flag = true;
					}
				}
			}
			break;
		}
		return flag;
	}

	public boolean checkvert1() {

		boolean flag = false;// creates boolean to act as flag

		int counter = 0;// creates counter
		while (flag) {

			// goes through board vertically
			for (int h = 0; 7 > h; h += 1) {
				for (int w = 0; 6 > w; w += 1) {
					if (BoardPrinter.board[w][h] == 'X') { // if it finds an X, add 1 to
												// counter
						counter += 1;
					} else {
						counter = 0; // if next piece is not an X, set counter
										// to 0
					}
					if (counter >= 4) {
						flag = true;
					}
				}
			}
			break;
		}
		return flag;
	}

	public boolean checkdiagfwd1() {
		// flag
		boolean flag = true;

		// counter
		int counter = 0;

		// check boolean
		Boolean check = false;

		// checkers
		int checkColumn = 1;
		int checkRow = 1;

		while (flag) { // goes through until an X is found
			for (int w = 0; 7 > w; w += 1) {
				for (int h = 0; 6 > h; h += 1) {
					if (BoardPrinter.board[w][h] == 'X') { // if X is found, add one to
												// counter and go into loop
						counter += 1;
						check = true;
						while (check) { // goes through diagonally looking for
										// Xs
							if (checkColumn + w <= 7 - 1 && checkRow + h <= 6 - 1) {
								if (BoardPrinter.board[w + checkColumn][h + checkRow] == 'X') { // if
																					// X
																					// is
																					// found,
																					// add
																					// 1
																					// to
																					// counter
									counter += 1;
								}
							}

							// adds 1 to checkers
							checkColumn += 1;
							checkRow += 1;

							if (checkColumn == 7 - 1 || checkRow == 6 - 1) { // if
																				// outside
																				// of
																				// board,
																				// break
								check = false;
								break;
							}

							if (counter >= 4) {
								check = false;
								flag = false;
								break;
							}
						}
					}
					if (counter >= 4) {
						flag = false;
						break;
					}

					// resets counter and checkers
					counter = 0;
					checkColumn = 1;
					checkRow = 1;
				}
			}
			break;
		}
		return flag;
	}

	public boolean checkdiagback1() {

		// flag
		boolean flag = true;

		// counter
		int counter = 0;

		// check boolean
		Boolean check = false;

		// checkers
		int checkColumn = 1;
		int checkRow = 1;

		while (flag) { // goes through until an X is found
			for (int w = 0; 7 > w; w += 1) {
				for (int h = 0; 6 > h; h += 1) {
					if (BoardPrinter.board[w][h] == 'X') { // if X is found, add one to
												// counter and go into loop
						counter += 1;
						check = true;
						while (check) { // goes through diagonally looking for
										// Xs
							if (w - checkColumn >= 0 && h - checkRow >= 0) {
								if (BoardPrinter.board[w - checkColumn][h - checkRow] == 'X') {
									counter += 1; // if X is found, add 1 to
													// counter
								}
							}

							// adds 1 to checkers
							checkColumn += 1;
							checkRow += 1;

							if (checkColumn == 0 || checkRow == 6 - 1) { // if
																			// outside
																			// of
																			// board,
																			// break
								check = false;
								break;
							}

							if (counter >= 4) {
								check = false;
								flag = false;
								break;
							}
						}
					}
					if (counter >= 4) {
						flag = false;
						break;
					}

					// resets counter and checkers
					counter = 0;
					checkColumn = 1;
					checkRow = 1;
				}
			}
			break;
		}
		return flag;

	}

	public boolean checkhoriz2() {

		boolean flag = false;// creates boolean to act as flag

		int counter = 0;// creates counter
		while (flag) {// goes through board horizontally

			for (int w = 0; 7 > w; w += 1) {
				for (int h = 0; 6 > h; h += 1) {
					if (BoardPrinter.board[w][h] == 'O') { // if it finds an X, add 1 to
												// counter
						counter += 1;
					} else {
						counter = 0; // if next piece is not an X, set counter
										// to 0
					}
					if (counter >= 4) {
						flag = true;
					}
				}
			}
			break;
		}
		return flag;

	}

	public boolean checkvert2() {
		boolean flag = false;// creates boolean to act as flag

		int counter = 0;// creates counter
		while (flag) {

			// goes through board vertically
			for (int h = 0; 7 > h; h += 1) {
				for (int w = 0; 6 > w; w += 1) {
					if (BoardPrinter.board[w][h] == 'O') { // if it finds an X, add 1 to
												// counter
						counter += 1;
					} else {
						counter = 0; // if next piece is not an X, set counter
										// to 0
					}
					if (counter >= 4) {
						flag = true;
					}
				}
			}
			break;
		}
		return flag;
	}

	public boolean checkdiagfwd2() {
		// flag
		boolean flag = true;

		// counter
		int counter = 0;

		// check boolean
		Boolean check = false;

		// checkers
		int checkColumn = 1;
		int checkRow = 1;

		while (flag) { // goes through until an X is found
			for (int w = 0; 7 > w; w += 1) {
				for (int h = 0; 6 > h; h += 1) {
					if (BoardPrinter.board[w][h] == 'O') { // if X is found, add one to
												// counter and go into loop
						counter += 1;
						check = true;
						while (check) { // goes through diagonally looking for
										// Xs
							if (checkColumn + w <= 7 - 1 && checkRow + h <= 6 - 1) {
								if (BoardPrinter.board[w + checkColumn][h + checkRow] == 'O') { // if
																					// X
																					// is
																					// found,
																					// add
																					// 1
																					// to
																					// counter
									counter += 1;
								}
							}

							// adds 1 to checkers
							checkColumn += 1;
							checkRow += 1;

							if (checkColumn == 7 - 1 || checkRow == 6 - 1) { // if
																				// outside
																				// of
																				// board,
																				// break
								check = false;
								break;
							}

							if (counter >= 4) {
								check = false;
								flag = false;
								break;
							}
						}
					}
					if (counter >= 4) {
						flag = false;
						break;
					}

					// resets counter and checkers
					counter = 0;
					checkColumn = 1;
					checkRow = 1;
				}
			}
			break;
		}
		return flag;
	}

	public boolean checkdiagback2() {
		// flag
		boolean flag = true;

		// counter
		int counter = 0;

		// check boolean
		Boolean check = false;

		// checkers
		int checkColumn = 1;
		int checkRow = 1;

		while (flag) { // goes through until an X is found
			for (int w = 0; 7 > w; w += 1) {
				for (int h = 0; 6 > h; h += 1) {
					if (BoardPrinter.board[w][h] == 'O') { // if X is found, add one to
												// counter and go into loop
						counter += 1;
						check = true;
						while (check) { // goes through diagonally looking for
										// Xs
							if (w - checkColumn >= 0 && h - checkRow >= 0) {
								if (BoardPrinter.board[w - checkColumn][h - checkRow] == 'O') {
									counter += 1; // if X is found, add 1 to
													// counter
								}
							}

							// adds 1 to checkers
							checkColumn += 1;
							checkRow += 1;

							if (checkColumn == 0 || checkRow == 6 - 1) { // if
																			// outside
																			// of
																			// board,
																			// break
								check = false;
								break;
							}

							if (counter >= 4) {
								check = false;
								flag = false;
								break;
							}
						}
					}
					if (counter >= 4) {
						flag = false;
						break;
					}

					// resets counter and checkers
					counter = 0;
					checkColumn = 1;
					checkRow = 1;
				}
			}
			break;
		}
		return flag;
	}

}

package view;
import java.util.Scanner;


	public abstract class View implements ViewInterface {

		Scanner keyboard = new Scanner(System.in);
		protected String displayMessage;

		public View(String message) {
			this.displayMessage = message;
		}


		@Override
		public void display() {
			String value = "";
			boolean done =false;

			do {
				System.out.println(this.displayMessage);
				value = this.getInput();
				done = this.doAction(value);

			}
			while (!done);
		}

		@Override
		public String getInput() {
			boolean valid = false;
			String selection = null;

			while (!valid) {
				//get the value entered from the keyboard
				selection = keyboard.nextLine();
				selection = selection.trim();

				if (selection.length() < 1) {//blank value entered
					System.out.println("You must enter a value");
					continue;

				}

				break;
			}

			return selection; //return the name


	}


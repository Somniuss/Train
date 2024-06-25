package com.somniuss.oop.main;

import com.somniuss.oop.train.*;
import com.somniuss.oop.trains.*;
import com.somniuss.oop.sort.Sort;
import com.somniuss.oop.view.View;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Trains trains = new Trains();

		trains.addTrain(new Train("Oslo", 1, "13:30"));
		trains.addTrain(new Train("Bergen", 666, "14:30"));
		trains.addTrain(new Train("Bergen", 667, "15:30"));
		trains.addTrain(new Train("Bodo", 8, "00:00"));
		trains.addTrain(new Train("Trondheim", 2, "14:30"));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the train number: ");
		int trainNumber = scanner.nextInt();
		View.printTrainInfo(trains, trainNumber);

		View.printAllTrains(trains);
		Sort.sortByNumber(trains);
		View.printAllTrains(trains);
		Sort.sortByDestinationAndTime(trains);
		View.printAllTrains(trains);
	}
}
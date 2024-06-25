package com.somniuss.oop.sort;

import com.somniuss.oop.train.Train;
import com.somniuss.oop.trains.Trains;
import java.util.Comparator;

public class Sort {

	public static void sortByNumber(Trains trains) {
		trains.getTrains().sort(Comparator.comparingInt(Train::getTrainNumber));
	}

	public static void sortByDestinationAndTime(Trains trains) {
		trains.getTrains().sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
	}
}

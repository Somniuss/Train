package com.somniuss.oop.trains;

import java.util.ArrayList;
import java.util.Objects;
import com.somniuss.oop.train.Train;

public class Trains {
	
	private ArrayList<Train> trains;

	public Trains() {
		trains = new ArrayList<>();
	}

	public ArrayList<Train> getTrains() {
		return trains;
	}

	public void setTrains(ArrayList<Train> trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trains other = (Trains) obj;
		return Objects.equals(trains, other.trains);
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	
	
}
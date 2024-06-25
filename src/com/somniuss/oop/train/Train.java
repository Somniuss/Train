package com.somniuss.oop.train;

import java.util.Objects;

public class Train {
	
	public Train() {
	}

	private String destination;
	private int trainNumber;
	private String departureTime;

	public Train(String destination, int trainNumber, String departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destination, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& trainNumber == other.trainNumber;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", trainNumber=" + trainNumber + ", departureTime=" + departureTime
				+ "]";
	}

}

/*
 * Created on 2024-10-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

// NO NEED TO TOUCH THIS FILE
public class TrainStation {
    public static void main(String[] args) {
        
        Train train = new Train();

        // Optional: Add another type of cargo
        train.addTrainCar("people");
        train.addTrainCar("potatoes");
        train.addTrainCar("potatoes");
        train.addTrainCar("people");
        train.addTrainCar("potatoes");
        train.getTrainCars().removeFirst();
        train.getTrainCars().removeLast();
        
        train.printTrain();
    }
}
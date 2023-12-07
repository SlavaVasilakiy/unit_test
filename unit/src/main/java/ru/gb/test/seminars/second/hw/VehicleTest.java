package ru.gb.test.seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void carIsInstanceOfVehicle() {
        Vehicle car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void carIsCreatedWithFourWheels() {
        Vehicle car = new Car("Toyota", "Camry", 2023);
        assertEquals(4, ((Car) car).getNumWheels());
    }

    @Test
    void motorcycleIsCreatedWithTwoWheels() {
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertEquals(2, ((Motorcycle) motorcycle).getNumWheels());
    }

    @Test
    void carTestDriveSetsSpeedTo60() {
        Vehicle car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, ((Car) car).getSpeed());
    }

    @Test
    void motorcycleTestDriveSetsSpeedTo75() {
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        assertEquals(75, ((Motorcycle) motorcycle).getSpeed());
    }

    @Test
    void carParkSetsSpeedToZero() {
        Vehicle car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, ((Car) car).getSpeed());
    }

    @Test
    void motorcycleParkSetsSpeedToZero() {
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, ((Motorcycle) motorcycle).getSpeed());
    }
}
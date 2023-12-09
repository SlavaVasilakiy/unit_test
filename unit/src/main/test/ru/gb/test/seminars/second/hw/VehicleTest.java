package ru.gb.test.seminars.second.hw;

import org.junit.jupiter.api.Test;
import ru.gb.test.seminars.second.hw.Car;
import ru.gb.test.seminars.second.hw.Motorcycle;
import ru.gb.test.seminars.second.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    @Test
    void carIsInstanceOfVehicle() {
        ru.gb.test.seminars.second.hw.Vehicle car = new ru.gb.test.seminars.second.hw.Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void carIsCreatedWithFourWheels() {
        ru.gb.test.seminars.second.hw.Vehicle car = new ru.gb.test.seminars.second.hw.Car("Toyota", "Camry", 2023);
        assertEquals(4, ((Car) car).getNumWheels());
    }

    @Test
    void motorcycleIsCreatedWithTwoWheels() {
        ru.gb.test.seminars.second.hw.Vehicle motorcycle = new ru.gb.test.seminars.second.hw.Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertEquals(2, ((Motorcycle) motorcycle).getNumWheels());
    }

    @Test
    void carTestDriveSetsSpeedTo60() {
        ru.gb.test.seminars.second.hw.Vehicle car = new ru.gb.test.seminars.second.hw.Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, ((Car) car).getSpeed());
    }

    @Test
    void motorcycleTestDriveSetsSpeedTo75() {
        ru.gb.test.seminars.second.hw.Vehicle motorcycle = new ru.gb.test.seminars.second.hw.Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        assertEquals(75, ((Motorcycle) motorcycle).getSpeed());
    }

    @Test
    void carParkSetsSpeedToZero() {
        ru.gb.test.seminars.second.hw.Vehicle car = new ru.gb.test.seminars.second.hw.Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, ((Car) car).getSpeed());
    }

    @Test
    void motorcycleParkSetsSpeedToZero() {
        ru.gb.test.seminars.second.hw.Vehicle motorcycle = new ru.gb.test.seminars.second.hw.Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, ((Motorcycle) motorcycle).getSpeed());
    }
}
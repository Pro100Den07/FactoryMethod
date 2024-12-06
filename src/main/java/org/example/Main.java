package org.example;

// Інтерфейс для транспортних засобів
interface Transport {
    void move();
}

// Реалізація автомобіля
class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Автомобіль їде по дорозі.");
    }
}

// Реалізація літака
class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Літак летить у небі.");
    }
}

// Абстрактний клас фабрики
abstract class TransportFactory {
    abstract Transport createTransport();
}

// Фабрика для автомобілів
class CarFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Car();
    }
}

// Фабрика для літаків
class PlaneFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Plane();
    }
}

// Клас для демонстрації
class Client {
    public void run() {
        // Створення фабрик
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        // Створення транспортних засобів
        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        // Виклик методів руху
        car.move();
        plane.move();
    }
}

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}

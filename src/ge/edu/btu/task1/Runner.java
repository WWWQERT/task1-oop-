package ge.edu.btu.task1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1, 27.2, 100.1, 10,2.13);
        Bus bus2 = new Bus(2, 23.12,  50.3, 5, 1.4 );

        Train train1 = new Train(1, 33.5,113.1,23);
        Train train2 = new Train(2, 123.5,100.12,13);
        Train train3 = new Train(3, 113.1,53.13,15);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus1);
        vehicles.add(bus2);
        vehicles.add(train1);
        vehicles.add(train2);
        vehicles.add(train3);

        try {
            validate(vehicles);
        } catch (vechilesException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შემთხვევა: " + ex.getMessage());
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

        private static void validate(List<Vehicle> vehicles) throws vechilesException
      {
        for (int i = 0; i < vehicles.size(); i++) {
            for (int j = i + 1; j < vehicles.size(); j++) {
                if (vehicles.get(i).getCode() == vehicles.get(j).getCode()) {
                    throw new vechilesException("Duplicate code");
                }
                else {
                    System.out.println(vehicles.get(i).getCode());
                    System.out.println(vehicles.get(i).travelTime());
//                    }
                }
            }
    }




    }
}

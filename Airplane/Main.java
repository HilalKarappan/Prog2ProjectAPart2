package Airplane;
//Project A Part 2
import Agri_MAV.AgriculturalDrone;
import Agri_MAV.MAV;
import Heli_Quad.Helicopter;
import Heli_Quad.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;

public interface Main {
	//CREATE NEW METHOD TO COPY ARRAY FROM MAIN
	public static void copyFlyingObjects(Main[] arr) {
		System.out.println("\n\nHere is a copy of Flying objects:");
		for (int i = 0; i < 15 ; i++)
            System.out.println(arr[i] + " ");
		}
	
	public static void main(String[] args) {
		
		//SET INFO
				Airplane a1 = new Airplane("Boeing", 143525.99, 400);
				Airplane a2 = new Airplane("Bell", 300000.99, 600);
				Helicopter h1 = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
				Helicopter h2 = new Helicopter(7, 2010, 6, "AirDemo", 400000.99, 700);
				Quadcopter q1 = new Quadcopter(4,4,0,"Aeryon",299.99,20, 50);
				Quadcopter q2 = new Quadcopter(4,4,0,"MD",899.99,30, 70);
				Multirotor m1 = new Multirotor(7, 10, 6, "Harriet", 400000.99, 700, 4);
				Multirotor m2 = new Multirotor(7, 5, 8, "Harriet", 123453.99, 900, 6);
				AgriculturalDrone ad1 = new AgriculturalDrone(80,299.99,"Aeryon", 50);
				AgriculturalDrone ad2 = new AgriculturalDrone(90,999.99,"Aeryon", 70);
				MAV mav1 = new MAV(234,10000.89, 200000.99, "Olinsky", 758);
				MAV mav2 = new MAV(400,23453.89, 45275.99, "Nonasky", 939);
				UAV uav1 = new UAV(60, 899.99);
				UAV uav2 = new UAV(60, 899.99);
				UAV uav3 = new UAV(100, 1299.99);
				
				Main arr[] = new Main[15];
				
				arr[0] = new Airplane("Boeing", 143525.99, 400);
				arr[1]  = new Airplane("Bell", 300000.99, 600);
				arr[2]  = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
				arr[3]  = new Helicopter(7, 2010, 6, "AirDemo", 400000.99, 700);
				arr[4]  = new Quadcopter(4,4,0,"Aeryon",299.99,20, 50);
				arr[5]  = new Quadcopter(4,4,0,"MD",899.99,30, 70);
				arr[6]  = new Multirotor(7, 10, 6, "Harriet", 400000.99, 700, 4);
				arr[7]  = new Multirotor(7, 5, 8, "Harriet", 123453.99, 900, 6);
				arr[8]  = new AgriculturalDrone(80,299.99,"Aeryon", 50);
				arr[9]  = new AgriculturalDrone(90,999.99,"Aeryon", 70);
				arr[10]  = new MAV(234,10000.89, 200000.99, "Olinsky", 758);
				arr[11]  = new MAV(400,23453.89, 45275.99, "Nonasky", 939);
				arr[12]  = new UAV(60, 899.99);
				arr[13]  = new UAV(60, 899.99);
				arr[14]  = new UAV(100, 1299.99);
		
				System.out.println("Flying Objects: ");
		        for (int i = 0; i < 15 ; i++)
		            System.out.println(arr[i] + " ");
		
		        copyFlyingObjects(arr);

	}

	
}
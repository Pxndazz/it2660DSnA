class Main 
{
	public static void main(String[] args) 
	{
    	// Use the instructions in Blackboard or instructions.md to complete Lab 6
    
		MyMap<String, Integer> creditHours = new MyHashMap<>(10);

		creditHours.put("IT-1025", 3);
		creditHours.put("IT-1050", 3);
		creditHours.put("IT-1150", 3);
		creditHours.put("IT-2310", 3);
		creditHours.put("IT-2320", 4);
		creditHours.put("IT-2351",4);
		creditHours.put("IT-2650", 4);
		creditHours.put("IT-2660", 4);
		creditHours.put("IT-2030", 4);

		System.out.println("IT-1025 exists: " + creditHours.containsKey("IT-1025"));
		System.out.println("IT-2110 exists: " + creditHours.containsKey("IT-2110"));

		printMap(creditHours);

		System.out.print("\n\n");

		creditHours.remove("IT-2030");
		creditHours.remove("IT-1150");

		printMap(creditHours);

  	}

	private static void printMap(MyMap<String, Integer> hashMap) // I wanted to set this up to print any map, not just <String, Integer>, but wasn't sure exactly how to (like if we had other variable type hashmaps <Boolean, String> for example)
	{                                                            // I attempting to do MyMap<K, V> hashMap but that wasn't working.
		for(String key : hashMap.keySet())
		{
			System.out.println("[" + key.hashCode()  + "\t" + key + "\t\t" + hashMap.get(key) + "]"); //returns negative hashcode; adding * -1 works but i'm not sure if that leads to unintended results
		}
	}
}

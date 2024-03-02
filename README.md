<h1 align = "center">TeachMeSkills_C27_lesson_16_HW</h1>
<h4>Task1:</h4> The program creates a collection of type Mar and fills it with pairs “client passport number” -> “client class object”.
Loops through the collection and displays:
- all key-value pairs, using Map.Entry<K, V> entry : map.entrySet()
- all key-value pairs, using an iterator
- all keys using map.keySet()
- all values using map.values()
<ul>
  <li>The Client class contains the fields name, registrationDate, age and a list of orders clientOrder to describe the client. Get, set methods and constructor have been created. Reassigned toString() method.</li>
  <li>The PassportID interface contains constants. Passport numbers.</li>
  <li>The Fabrik class has a customerInput() method that returns a list of customers with their description. The firstInputOrders(), secondInputOrders(), thirdInputOrders() methods have been created, which return a list of customer orders.</li>
  <li>In the Orders class, the fields name, price and description are created. Their get and set methods. Constructor. And the toString() method is reassigned.</li>
  <li>The Runner class calls methods to display information to the console.</li>
  <li>he Service class contains the clientOutput() method, which takes a Map<String, Client> and outputs it to the console in a for each loop. The clientOutputIterator() method takes a Map<String, Client> and outputs it in a while loop (iterator.hasNext()) to the console. The outputKeys() method takes a Map<String, Client> and outputs Keys to the console. The outputValues() method takes a Map<String, Client> and outputs Values to the console.</li>
</ul>

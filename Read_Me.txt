🌸 Alpha Flowers Inventory Management System
This Java console application manages a small flower shop's inventory, providing functionality to add, delete, search, and update flowers. It reads from a database of flowers and keeps track of inventory-related metrics such as retail and wholesale values.

📁 Files
FlowersDriver.java
Main program with menu-driven interface.

Reads from Flowers_db.txt and loads flowers into an array.

Supports operations:

Add new flower

Delete flower by ID

Look up flower by ID

Buy more of an existing flower (pending implementation)

Sell flower (pending implementation)

Writes sorted flower records back to alphaFlowers_db.txt.

DatabaseTotals.java
A helper class to store and manage inventory metrics like:

Total items purchased/sold

Total wholesale/retail value

Total flower name count

Total inventory on hand

Sales tax calculations

alphaFlowers_db.txt
A flat text file representing the flower inventory.

Each line follows the format:

nginx
Copy
Edit
Flower [id=..., name=..., color=..., size=..., wholesalePrice=..., retailPrice=..., onHand=...]
🛠 How to Run
Compile the Java files:

bash
Copy
Edit
javac FlowersDriver.java DatabaseTotals.java Flower.java
Run the program:

bash
Copy
Edit
java FlowersDriver
Follow the on-screen menu to perform inventory actions.

📌 Notes
Ensure Flowers_db.txt exists in the working directory before running.

The system uses a max capacity of 50 flowers.

The Flower class (not included here) is expected to have getter and setter methods and implement Comparable<Flower> for sorting.

Some menu options like "Sell Flower" and "Buy More of Existing Flower" are listed but not fully implemented.

👨‍💻 Author
Harsh Malik
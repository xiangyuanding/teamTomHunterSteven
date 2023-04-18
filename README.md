Group member:
Steven
Tom
Hunter

Concept: What is the facade design pattern and when we should use it?
Facade pattern is a structural pattern that allows the user to interact with a complex system through a simplified interface, hiding the complexity of the system and providing a simpler abstraction. This pattern involves a single class which provides simplified methods required by the client and delegates calls to methods of existing sub-system classes.
This pattern is a useful tool, particularly in situations where a complex system needs to be simplified for ease of use or when a simplified interface is required for a system with multiple subsystems.
For example, there is a Phone interface and concrete classes implementing the Phone interface including Apple, Pixel, Huawei and Samsung. A facade class PhoneMaker uses the concrete classes to delegate user calls to these classes. In the driver, when a PhoneMaker object is created and its method createPhones is called. It will delegate the call to these concrete classes and create these particular phone objects. When a PhoneMaker method called getPrice() is called and  the results get printed. Behind the scenes, all the getPrice() methods in these concrete classes are called and the price of these different phones will be printed out.
Code Walkthrough:
In our example, there are five files: 
RobotLeader.java
RobotLeaderImpl.java
WeatherBot.java
TimeBot.java
ReverseBot.java
Interface RobotLeader, represents a robot leader that can give commands to 3 robots: the weather bot, the time bot and the reverse bot. RobotLeader is the simplified facade interface which users can interact with. WeatherBot.java, TimeBot.java and ReverseBot.java are the concrete sub-system classes that are hidden. 
In the driver class, after a RobotLeader object is initialized, three new Bot objects are initialized as well including WeatherBot, TimeBot and ReverseBot. Then users are prompted to enter an integer between 1~3(inclusive). 
When a user enters 1, callWeatherBot() will be called and then it delegates the call to the getWeather() method in the WeatherBot class and a random weather condition will be printed out. 
When a user enters 2, callTimeBot() will be called and then it delegates the call to the time() method in the TimeBot class and the current time and date info will be printed. When a user enters 3 and enters a string, callReverseBot() will be called and then it delegates the call to the reverse() method in the ReverseBot class and a reverse string will be printed out.

How to run:
Run the Driver class.
(After running, the following instructions will be printed out on the terminal)
please select which robot you need to call
1 -- Weather bot
2 -- Time bot
3 -- Reverse bot
Select a number between 1 and 3(inclusive) to command a certain robot to execute an order.
If 1 is chosen, a random weather condition will be printed out such as sunny.
If 2 is chosen, the current date and time will be printed out.
For example:
2023/3/17
16:7:2
If 3 is chosen, the program will tell you: “please type the word you want to reverse”
You should then type a string. After that, the reversed string will be printed out.
For example:
hello world
dlrow olleh


A UML diagram for the code:
![plot](https://github.com/xiangyuanding/teamTomHunterSteven/blob/main/robot_diagram.jpg)

Reference:
“Design Patterns - Facade Pattern.” Tutorials Point, https://www.tutorialspoint.com/design_pattern/facade_pattern.htm. 

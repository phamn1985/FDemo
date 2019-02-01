To run the Test Case:
1. Please install Ecplise with testNG
2. Install the Java Development Kit (JDK)
3. Set Up Java Environment Variable Path
4. Install Android SDK / ADB on Windows
5. Install and start Appium Server
6. Download FossilDemo Folder
7. Download FossilData Folder
8. Please open the ExternalFileConfiguration java class in //FossilDemo /Src/CoreFramework, then edit the location of the defaultDirectory to your current FossilData Folder (Default is set to D:/QuoineData, if you copy QuineData to your D Drive thens kip this step). Also you can modify the class to point to your own Apium URL if required
9. You can execute by 2 method: Run the testng.xml file as an TestNGSuite or you can run the TestExecute.java as an Java Application with parrameter set to 'no' (I will Explain later).



Desciption:

When I did this excercise, I have a larger framework in mind. But I dont have enough time. I was planning to build the project as an demo for external Test Plan and Test Result will update on the Test Plan rather than using testNG report. The purpose is to take the Excel file as an external Test Management System such as TestRails (etc..) and we will replace the Excel read files to the Test Management API calls. However, to execute this, we will have to build different executable Jar files to execute the Test and update the result seperately (we can also build Bat file to do that, but it's kinda hard to give detailed structure in a short time I could spent to build this. ALL THE CODE IS ALREADY IMPLEMENTED)
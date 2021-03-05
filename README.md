# BRTS-management-system
A Simple GUI based Application in java 

 
1  Problem Statement
The system that currently being used for city bus ticket booking by the staff is an internal system and is used only to sell tickets .
Customers have to go to different counters or refer the schedules, routes.This uses a lot of human effort and time.
There is no provision of a single platform where all city bus related information is available along with ticket booking system. 


2  Objectives
Creating a software that is user friendly and can
•	Creating an Application that can provide all the details about city routes.
•	Application should be able to calculate bus fares and distances automatically.
•	Creating a Application that can be used to book and print tickets according to the selected details.
•	Application needs to get the report regarding the total collection and passengers.
•	Application also shpuld be able to record complaints and given by the passengers and  staff and save it in the form of a text file .




3  List of classes

1.Menu
    -connects all other classes

2.Contacts
     -Displays important contacts

3.Details
     -Displays the bus details

4.Map
     -Shows the bus route map


5.Print
     -For printing the ticket along with details like Date ,Time etc

6.Report
    -For obtaining a report of the tickets booked

7.Travel
    -for displaying various ticket booking options and printing

 



4 Data Strctures used

4.1.Hash Map

A Hash map is used in the Travel Class to calculate the distances between two stops without hard coding the individual prices.
The distance can be further used to clculate prices by multiplying distances with PricePerKm.

4.2  Array

 The array is used in this project store the values(ticket codes )read from file to save as a integer array and then,
 This array is used to search for a specific code using Linear Search Algorithm.


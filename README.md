# Enhance  Test

#Query any existing Used Car listing and confirm that the following details
are shown for that car:
- Number plate
- Kilometres
- Body
- Seats
# How to run the test

Clone the repository
```xml
git clone -b main https://github.com/roshanRBA/TradeMeListingTest.git
```
Open the project
```xml
cd TradeMeListing
```
Run the test
```xml
mvn verify test
```
Automated steps:

1. Trade Me Motors website will be opened on the chrome driver. 
2. It will search for "Mazda 3 2018" or any other term given in the test script
3. From the search results, a random vehicle will be picked up and opened
4. Availability of Number plate, Kilometres, Body and the seats count will be checked on the randomly selected item. 

#Note:
TradeMe Sandbox website does not have any active used car listings so that the live website has been used for the test

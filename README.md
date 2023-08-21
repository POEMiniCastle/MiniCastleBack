# MiniCastleBack

## How to use

Install [docker](https://www.docker.com/).

Run it.

Open a widows command  at the root of the project

 Type `docker compose up`
 
 PGAdmin is now accessible at : [http://localhost:16543](http://localhost:16543).
 
 Default credentials :
 
 Username : `email@gmail.com`
 
Password : `rVrP6kucvgm%JPMkDoYSfvB3tPXUgP4^DMwZY6K3r@VgD!ot7spH8hhUH@jpWMGxx#CnTe794Vt%2apfRxm8bo4o^Wc!U&uTUtKGC!cKwekrtFFQWj&jpc7dG6!CCxLt`

### Add the server
On the dashboard click on `Add New Server` 
Name : `MiniCastle`
##### Go in the connection tab
Hostname : `postgres-compose`

Port : `5432`

Maintenance database : `postgres`

Username : `postgres`

Password : `T*WCHEhUny7ZE#nG4LQv4*ZLdPH#EoZcR9LxzVSHpyUedJitmDkXA^h@tQ#gsJWFnRJdzuc&kXT^G3LxJ!mrk4vBexHDyd#oxzxhCg8KpJpt8yY5gH^tWpzWJh2#sq3y`

### Create database
- MiniCastleBDD > Database (1) > postgres > Schemas > public
Right click on public, the Query Tool.
- Open CreateBDD_V0.9.sql and InsertDATA_V1.1.sql with a text editor and excute both inside the query tool.
- You can use the same query tool to check if everything worked by using `SELET * FROM card`. A list should appear under the query tool.

## Launch the server

Open the project in your IDE
Go to MiniCastleBack\src\main\java\Mini_Castle\app
Run AppApplication.java.
The last line should look something like this : `Started AppApplication in 4.448 seconds (process running for 4.876)`.

Congrats the app is running you can now go to [https://github.com/POEMiniCastle/MiniCastleFront](https://github.com/POEMiniCastle/MiniCastleFront).


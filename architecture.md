 # Winnipeg Sports App Architecture

```
                          +---------------------------------------------------------------------------+
                          |                                                                           |
                          | +-------------------------+  +----------------+                           |
                          | |   Currently Playing     |  | Rosters of     |                           |
                          | |(Displays list of games) |  | playing teams  |                           |
Presentation Layer        | +-----------+-----^-------+  +-----+---^------+                           |
                          |             |     |                |   |                                  |
                          |             |     |                |   |    +-------------------------+   |
                          |             +----------------------+   |    |  Any sports data that   |   |
                          |             |     |                    |    |  is to be displayed and |   |
                          |             +-------------------------------+  consumed by the user   |   |
                          |             |     |                    |    |                         |   |
                          |             |     +---------------+    |    +-----------^-------------+   |
                          |             |                     |    |                |                 |
                          +---------------------------------------------------------------------------+
                          |             |                     |    |                |                 |
                          |             |                     |    |                |                 |
                          |             |                     |    |      +---------+                 |
                          |             |                     |    |      |                           |
                          |             v                     |    |      |                           |
      Logic Layer         |   +---------+-----------+     +---+----+------+---+                       |
                          |   | A class in this     |     |  Interface will   |                       |
                          |   | layer will create an|     |  return a List    |                       |
                          |   | object that will    |     |  containing       |                       |
                          |   | retrieve requested  |     |  requested data.  |                       |
                          |   | data.               |     |                   |                       |
                          |   +---------+-----------+     +---^---------------+                       |
                          |             |                     |                                       |
                          |             |                     |                                       |
                          |             |     +---------------+--+                                    |
                          +-------------------+ Interface-with   +------------------------------------+
                          |             |     | methods to help  |                                    |
                          |             +-----> access some game |                                    |
                          |                   | data.            |                                    |
                          |                   +-----+-----^------+                                    |
                          |                         |     |                                           |
                          |                         |     |                                           |
       Data Layer         |                 +-------v-----+------+         +---------------+          |
                          |                 | Database storing a |         |Goal is to pull|          |
                          |                 | list of live games |         |this data from |          |
                          |                 | and team info.     +<--------+     APIs      |          |
                          |                 | (Fake as of I1)    |         |               |          |
                          |                 +--------------------+         +---------------+          |
                          |                                                                           |
                          |                                                                           |
                          +---------------------------------------------------------------------------+
```



 * The sketch is a general, high-level visual flow of how we want things to work inside our application.

 ## Packages and Major Source Code Files
 * comp3350.winSport.buisness
    * The logic layer. Files in this package connects what is presented in the presentation layer, with information retrieved in the data layer.
    * Handles calculations, list creation, and how data will be viewed once it arrives in the presentation layer.
    * **AccessGames** --> class that retrieves the list of games for our Currently Playing feature.
 * comp3350.winSport.objects
    * Contains objects needed to create a Game object, where we can then retrieve information about a live game.
    * Includes Player, League, Team, and Period objects as well. 
    * **Game** --> An object containing everything needed to know about a game that is happening. Including information about the players, league, teams, and what period the current game is in.
 * comp3350.winSport.persistence
    * This is the data layer. This is also where the our fake DB resides in. 
    * Operated through an interface that interacts with the GameData class. Information here is retrieved by the logic layer. 
    * Our API implementation will also be found here. 
    * **GameData** --> Implementation of fake DB that stores a list of games happening now (or upcoming); data pulled by the logic layer for the Currently Playing feature.
 * comp3350.winSport.presentation
    * Files for the visual interface or the UI. 
    * What the user sees. 
    * **RVAdapter** --> sets up the elements to be displayed on the screen and how they will look like. 

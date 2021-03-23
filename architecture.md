 # Winnipeg Sports App Architecture

```
                    +------------------------------------------------------------------------------------------------------------------------+
                    |                                                                                                                        |
                    |                +-------------+   +-------------------------+  +----------------+                                       |
                    |                |  Player     |   |   Currently Playing     |  | Rosters of     |                                       |
                    |                |  Statistics |   |(Displays list of games) |  | playing teams  |                                       |
                    |                +------+------+   +-----------+-------------+  +-----+---+------+                                       |
Presentation Layer  |                       |                      |                      |   |                 +--------------+             |
                    |                       |                      |                      |   |                 |              |             |
                    |                       +-------+-------------------------------------+---+----^------------+ Channel List |             |
                    |                               |              |                               |            |              |             |
                    |                       +-------+-------+      |                               |            +--------------+             |
                    |                       |   Schedule    |      |                               |                                         |
                    |                       +---------------+      |                               |                                         |
                    |                                              |                               |                                         |
                    +------------------------------------------------------------------------------------------------------------------------+
                    |                                              |                               |                                         |
                    |                                              |                               |                                         |
                    |                                              |                               |                                         |
                    |                                              |                               |                                         |
                    |                                              |                               |                                         |
                    |                              +---------------v-----------+   +---------------+------------------+                      |
      Logic Layer   |                              |   A class in this layer   |   |                                  |                      |
                    |                              |   will create an object   |   | Interfaces will return an object |                      |
                    |                              |   that will retrieve the  |   | or List object containing        |                      |
                    |                              |   requested data.         |   | requested data.                  |                      |
                    |                              +---------------+-----------+   |                                  |                      |
                    |                                              |               +-----^----------------------------+                      |
                    |                                              |                     |                                                   |
                    |                                              |                     |                                                   |
                    |                                   +----------v---------------------+--+                                                |
                    +-----------------------------------+  Interfaces with methods to help  +------------------------------------------------+
                    |                                   |  access data needed from the      |                                                |
                    |                                   |  databases in the data layer.     |                                                |
                    |                                   +----------+------------^-----------+                                                |
                    |                                              |            |                                                            |
                    |                                              |            |                                                            |
                    |                                              |            |                                                            |
                    |                           +------------------v------------+-----------+         +------------------+                   |
       Data Layer   |                           |                                           |         |                  |                   |
                    |                           |  Databases storing list of live games,    |         |  Goal is to pull |                   |
                    |                           |  teams, and other related information.    +---------+  this data from  |                   |
                    |                           |  Has both fake and HSQLDB implmenations.  |         |       APIs       |                   |
                    |                           |                                           |         |                  |                   |
                    |                           +-------------------------------------------+         +------------------+                   |
                    |                                                                                                                        |
                    +------------------------------------------------------------------------------------------------------------------------+


```



 * The sketch is a general, high-level visual flow of how we want things to work inside our application.

 ## Packages and Major Source Code Files
 * comp3350.winSport.buisness
    * The logic layer. Files in this package connects what is presented in the presentation layer, with information retrieved in the data layer.
    * Handles calculations, list creation, and how data will be viewed once it arrives in the presentation layer.
        * `AccessGames` --> class that retrieves `Game` objects and lists.
        * `AccessTeams` --> class that retrieves `Team` objects and lists. 
        * `AccessPlayers` --> class that retrieves `Player` objects and lists. 
        * `AccessPlayerStats`**(new)** --> class that retrieves player statistics for a player.
 * comp3350.winSport.objects
    * Contains classes needed to create a Game object, where we can then retrieve information about a live game.
    * Includes `Player`, `League`, `Team`, and `Period` classes as well. 
        * `Game` --> An object containing everything needed to know about a game that is happening. Including information about the players, league, teams, and what period the current game is in.
        * **Newly added:** `PlayerStatistic` class, which is used in `AccessPlayerStats`.
 * comp3350.winSport.persistence
    * This is the data layer. This is also where the our fake DB and HSQLDB resides in. 
    * Information here is retrieved by the logic layer, which is retrieved via several interfaces.
    * Our API implementation will also be found here. 
    * The following comes in both fakeDB and HSQLDB implementations: 
      * `GameData` --> Implements `IGame`; stores a list of games happening now (or upcoming).
      * `PlayerData` --> Implements `IPlayer`; stores basic player data.
      * `PlayerStats` **(new)** --> Implements `IPlayerStats`; stores in-depth player statistics.
      * `TeamData` --> Implements `ITeam`; stores hockey teams.
 * comp3350.winSport.presentation
    * Files for the visual interface or the UI. 
    * What the user sees. 
        * `CurrentAdapter`
        * `CurrentlyPlayingActivity`
        * `MainActivity`
        * `RosterActivity`
        * `RosterAdapter`
        * `SplashScreenActivity`
        * `Teams`
        * `Channel` **(new)**
        * `ChannelAdapter` **(new)**
        * `ChannelItem` **(new)**
        * `PlayersAdapter` **(new)**
        * `PlayerStatsActivity` **(new)**
        * `ScheduleActivity` **(new)**
        * `ScheduleAdapter` **(new)**
        * `TeamScheduleActivity` **(new)**

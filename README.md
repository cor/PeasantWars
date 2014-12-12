PeasantWars
===========

By Leon Grasmeijer and Cor Pruijs


classes
-------

<pre>
Game                // the main class, instances of this class will be the game
    Scene           // this class will contain all level data, with tiles
        Tile        // a tile is a unit on the map, and will contain data like it's position and if it collides with the player
        Player      // the player, a base class for Peasant and Hero
            Peasant // a player subclass which is very weak
            Hero    // a player subclass that uses superior technology and is a lot stronger
</pre>
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Event;
import mountkabru.MountKabru;


/**
 * Created by badgero1234 on 3/23/16.
 *    */
public class EventControl {
    
    public static Event[][] createEvents() {
        
        
        Event[][] events = new Event[4][1];
        Actor[][] actors = MountKabru.getCurrentGame().getActors();
        int[][] goldEvents = goldEvents();
        int EventType = 0;

    
       
            Event[] plainsEvent = new Event[2];
            plainsEvent[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors.ordinal()], null);
        events[0] = plainsEvent;
      
            Event[] jungleEvent = new Event[2];
            jungleEvent[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors.ordinal()], null);
        events[1] = jungleEvent;

            Event[] darkForestEvent = new Event[2];
            darkForestEvent[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors.ordinal()], null);
        events[2] = darkForestEvent;
        
        
        
            Event[] mountainEvent = new Event[2];
            mountainEvent[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors.ordinal()], null);
        events[3] = mountainEvent;
        
        return events;
    }

    private static int[][] goldEvents() {
       
        int[][] goldEvents = new int[4][1];

            //creates a random number and adds it to the players gold
            
            int[] plainsGoldEvent = new int[4];
            int goldAmountPlains1 = (int) (Math.random() * 10 + 50);
            int goldAmountPlains2 = (int) (Math.random() * 10 + 50);      
            int goldAmountPlains3 = (int) (Math.random() * 10 + 50);             
            int goldAmountPlains4 = (int) (Math.random() * 10 + 50);  

            plainsGoldEvent[0] = goldAmountPlains1;
            plainsGoldEvent[1] = goldAmountPlains2;  
            plainsGoldEvent[2] = goldAmountPlains3;
            plainsGoldEvent[3] = goldAmountPlains4;
        goldEvents[0] = plainsGoldEvent;
             
            int[] jungleGoldEvent = new int[4];
            int goldAmountjungle1 = (int) (Math.random() * 10 + 50);
            int goldAmountjungle2 = (int) (Math.random() * 10 + 50);      
            int goldAmountjungle3 = (int) (Math.random() * 10 + 50);             
            int goldAmountjungle4 = (int) (Math.random() * 10 + 50);  

            jungleGoldEvent[0] = goldAmountjungle1;
            jungleGoldEvent[1] = goldAmountjungle2;  
            jungleGoldEvent[2] = goldAmountjungle3;
            jungleGoldEvent[3] = goldAmountjungle4;    
        goldEvents[1] = jungleGoldEvent;  
                
            int[] forestGoldEvent = new int[4];
            
            int goldAmountForest1 = (int) (Math.random() * 10 + 50);
            int goldAmountForest2 = (int) (Math.random() * 10 + 50);      
            int goldAmountForest3 = (int) (Math.random() * 10 + 50);             
            int goldAmountForest4 = (int) (Math.random() * 10 + 50);  

            forestGoldEvent[0] = goldAmountForest1;
            forestGoldEvent[1] = goldAmountForest2;  
            forestGoldEvent[2] = goldAmountForest3;
            forestGoldEvent[3] = goldAmountForest4;
        goldEvents[2] = forestGoldEvent; 
                
            int[] mountainGoldEvent = new int[4];
            int goldAmountMountain1 = (int) (Math.random() * 10 + 50);
            int goldAmountMountain2 = (int) (Math.random() * 10 + 50);      
            int goldAmountMountain3 = (int) (Math.random() * 10 + 50);             
            int goldAmountMountain4 = (int) (Math.random() * 10 + 50);  

            mountainGoldEvent[0] = goldAmountMountain1;
            mountainGoldEvent[1] = goldAmountMountain2;  
            mountainGoldEvent[2] = goldAmountMountain3;
            mountainGoldEvent[3] = goldAmountMountain4;
        goldEvents[3] = mountainGoldEvent;
        
        return goldEvents;
    }
    
    public enum goldEventType {
        plainsGoldEvent,
        jungleGoldEvent,
        forestGoldEvent,
        mountainGoldEvent,
    }

    public enum EventType {
           plainsEvent,
           jungleEvent,
           forestEvent,
           mountainEvent,

    }

    public static int pickRandomNumber() {
        
        int numberReturn;
        int randomNumber = (int) (Math.random() * 10);
        
        
        
        if (randomNumber < 3) {
            numberReturn = 0;
        } else {
            numberReturn = 1;
        }
        
        return numberReturn;
    }




    }


package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Event;
import mountkabru.MountKabru;


/**
 * Created by badgero1234 on 3/23/16.
 *    */
public class EventControl {
    
    public static Event[][] createEvents() {
        
        
        Event[][] events = new Event[32][1];
        Actor[][] actors = MountKabru.getCurrentGame().getActors();
        int[][] goldEvents = goldEvents();
        int EventType = 0;

    
    //Plains Events  
            Event[] plainsEvent1 = new Event[2];
            plainsEvent1[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent1[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors1.ordinal()], null);
        events[0] = plainsEvent1;
        
            Event[] plainsEvent2 = new Event[2];
            plainsEvent2[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent2[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors2.ordinal()], null);
        events[1] = plainsEvent2;
        
            Event[] plainsEvent3 = new Event[2];
            plainsEvent3[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent3[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors3.ordinal()], null);
        events[2] = plainsEvent3;
        
            Event[] plainsEvent4 = new Event[2];
            plainsEvent4[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent4[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors4.ordinal()], null);
        events[3] = plainsEvent4;
        
            Event[] plainsEvent5 = new Event[2];
            plainsEvent5[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent5[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors5.ordinal()], null);
        events[4] = plainsEvent5;
        
            Event[] plainsEvent6 = new Event[2];
            plainsEvent6[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent6[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors6.ordinal()], null);
        events[5] = plainsEvent6;
        
            Event[] plainsEvent7 = new Event[2];
            plainsEvent7[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent7[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors7.ordinal()], null);
        events[6] = plainsEvent7;
        
            Event[] plainsEvent = new Event[2];
            plainsEvent[0] = new Event("Gold", "plains", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.plainsGoldEvent.ordinal()]);
            plainsEvent[1] = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.plainsActors8.ordinal()], null);
        events[7] = plainsEvent;
 
    //Jungle Events
            Event[] jungleEvent1 = new Event[2];
            jungleEvent1[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent1[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors1.ordinal()], null);
        events[8] = jungleEvent1;
        
            Event[] jungleEvent2 = new Event[2];
            jungleEvent2[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent2[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors2.ordinal()], null);
        events[9] = jungleEvent2;
        
            Event[] jungleEvent3 = new Event[2];
            jungleEvent3[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent3[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors3.ordinal()], null);
        events[10] = jungleEvent3;
        
            Event[] jungleEvent4 = new Event[2];
            jungleEvent4[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent4[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors4.ordinal()], null);
        events[11] = jungleEvent4;
        
            Event[] jungleEvent5 = new Event[2];
            jungleEvent5[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent5[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors5.ordinal()], null);
        events[12] = jungleEvent5;
        
            Event[] jungleEvent6 = new Event[2];
            jungleEvent6[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent6[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors6.ordinal()], null);
        events[13] = jungleEvent6;
        
            Event[] jungleEvent7 = new Event[2];
            jungleEvent7[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent7[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors7.ordinal()], null);
        events[14] = jungleEvent7;
        
            Event[] jungleEvent8 = new Event[2];
            jungleEvent8[0] = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload",null, goldEvents[goldEventType.jungleGoldEvent.ordinal()]);
            jungleEvent8[1] = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.jungleActors8.ordinal()], null);
        events[15] = jungleEvent8;
        
            
    //Forest Events
            Event[] darkForestEvent1 = new Event[2];
            darkForestEvent1[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent1[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors1.ordinal()], null);
        events[16] = darkForestEvent1;
        
            Event[] darkForestEvent2 = new Event[2];
            darkForestEvent2[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent2[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors2.ordinal()], null);
        events[17] = darkForestEvent2;
        
            Event[] darkForestEvent3 = new Event[2];
            darkForestEvent3[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent3[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors3.ordinal()], null);
        events[18] = darkForestEvent3;
        
            Event[] darkForestEvent4 = new Event[2];
            darkForestEvent4[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent4[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors4.ordinal()], null);
        events[19] = darkForestEvent4;
        
            Event[] darkForestEvent5 = new Event[2];
            darkForestEvent5[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent5[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors5.ordinal()], null);
        events[20] = darkForestEvent5;
        
            Event[] darkForestEvent6 = new Event[2];
            darkForestEvent6[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent6[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors6.ordinal()], null);
        events[21] = darkForestEvent6;
        
            Event[] darkForestEvent7 = new Event[2];
            darkForestEvent7[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent7[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors7.ordinal()], null);
        events[22] = darkForestEvent7;
        
            Event[] darkForestEvent8 = new Event[2];
            darkForestEvent8[0] = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.forestGoldEvent.ordinal()]);
            darkForestEvent8[1] = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.forestActors8.ordinal()], null);
        events[23] = darkForestEvent8;
        
        
    //Mountain Events    
            Event[] mountainEvent1 = new Event[2];
            mountainEvent1[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent1[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors1.ordinal()], null);
        events[24] = mountainEvent1;
        
            Event[] mountainEvent2 = new Event[2];
            mountainEvent2[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent2[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors2.ordinal()], null);
        events[25] = mountainEvent2;
        
            Event[] mountainEvent3 = new Event[2];
            mountainEvent3[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent3[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors3.ordinal()], null);
        events[26] = mountainEvent3;
        
            Event[] mountainEvent4 = new Event[2];
            mountainEvent4[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent4[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors4.ordinal()], null);
        events[27] = mountainEvent4;
        
            Event[] mountainEvent5 = new Event[2];
            mountainEvent5[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent5[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors5.ordinal()], null);
        events[28] = mountainEvent5;
        
            Event[] mountainEvent6 = new Event[2];
            mountainEvent6[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent6[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors6.ordinal()], null);
        events[29] = mountainEvent6;
        
            Event[] mountainEvent7 = new Event[2];
            mountainEvent7[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent7[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors7.ordinal()], null);
        events[30] = mountainEvent7;
        
            Event[] mountainEvent8 = new Event[2];
            mountainEvent8[0] = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload", null, goldEvents[goldEventType.mountainGoldEvent.ordinal()]);
            mountainEvent8[1] = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling", actors[ActorControl.ActorGroup.mountainActors8.ordinal()], null);
        events[31] = mountainEvent8;
        
            
        
        return events;
    }

    private static int[][] goldEvents() {
       
        int[][] goldEvents = new int[4][1];

            //creates a random number and adds it to the players gold
            
            int[] plainsGoldEvent = new int[4];
            int goldAmountPlains1 = (int) (Math.random() * 10 + 15);
            int goldAmountPlains2 = (int) (Math.random() * 10 + 25);      
            int goldAmountPlains3 = (int) (Math.random() * 10 + 30);             
            int goldAmountPlains4 = (int) (Math.random() * 10 + 60);  

            plainsGoldEvent[0] = goldAmountPlains1;
            plainsGoldEvent[1] = goldAmountPlains2;  
            plainsGoldEvent[2] = goldAmountPlains3;
            plainsGoldEvent[3] = goldAmountPlains4;
        goldEvents[0] = plainsGoldEvent;
             
            int[] jungleGoldEvent = new int[4];
            int goldAmountjungle1 = (int) (Math.random() * 10 + 50);
            int goldAmountjungle2 = (int) (Math.random() * 10 + 150);      
            int goldAmountjungle3 = (int) (Math.random() * 10 + 300);             
            int goldAmountjungle4 = (int) (Math.random() * 10 + 500);  

            jungleGoldEvent[0] = goldAmountjungle1;
            jungleGoldEvent[1] = goldAmountjungle2;  
            jungleGoldEvent[2] = goldAmountjungle3;
            jungleGoldEvent[3] = goldAmountjungle4;    
        goldEvents[1] = jungleGoldEvent;  
                
            int[] forestGoldEvent = new int[4];
            
            int goldAmountForest1 = (int) (Math.random() * 10 + 500);
            int goldAmountForest2 = (int) (Math.random() * 10 + 600);      
            int goldAmountForest3 = (int) (Math.random() * 10 + 700);             
            int goldAmountForest4 = (int) (Math.random() * 10 + 800);  

            forestGoldEvent[0] = goldAmountForest1;
            forestGoldEvent[1] = goldAmountForest2;  
            forestGoldEvent[2] = goldAmountForest3;
            forestGoldEvent[3] = goldAmountForest4;
        goldEvents[2] = forestGoldEvent; 
                
            int[] mountainGoldEvent = new int[4];
            int goldAmountMountain1 = (int) (Math.random() * 10 + 400);
            int goldAmountMountain2 = (int) (Math.random() * 10 + 600);      
            int goldAmountMountain3 = (int) (Math.random() * 10 + 800);             
            int goldAmountMountain4 = (int) (Math.random() * 10 + 1000);  

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
           plainsEvent1,
           plainsEvent2,
           plainsEvent3,
           plainsEvent4,
           plainsEvent5,
           plainsEvent6,
           plainsEvent7,
           plainsEvent8,
           jungleEvent1,
           jungleEvent2,
           jungleEvent3,
           jungleEvent4,
           jungleEvent5,
           jungleEvent6,
           jungleEvent7,
           jungleEvent8,
           forestEvent1,
           forestEvent2,
           forestEvent3,
           forestEvent4,
           forestEvent5,
           forestEvent6,
           forestEvent7,
           forestEvent8,
           mountainEvent1,
           mountainEvent2,
           mountainEvent3,
           mountainEvent4,
           mountainEvent5,
           mountainEvent6,
           mountainEvent7,
           mountainEvent8,
           

    }

    public static int pickRandomEvent() {
        
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


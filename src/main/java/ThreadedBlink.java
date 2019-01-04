import static haiku.arduino.processing.Arduino.*;  
public class ThreadedBlink {  
  static byte mainLEDPin = 5;  
  static byte backLEDPin = 6;

  private static class BackgroundTask extends Thread {
    public void run() {
      while (true) {
        System.out.println("Fast blink");  
        digitalWrite(backLEDPin, HIGH);     // sets the LED on  
        delay(500);
        digitalWrite(backLEDPin, LOW);      // sets the LED off  
        delay(500);
      }
    }
  }

  public static void loop()           // run over and over again  
  {  
    System.out.println("Slow blink");  
    digitalWrite(mainLEDPin, HIGH);     // sets the LED on  
    delay(1000);                    // waits for a second  
    digitalWrite(mainLEDPin, LOW);      // sets the LED off  
    delay(1000);                    // waits for a second  
  }  

  public static void main(String[] args) {
    System.out.println("In BlinkProcessing main");  
    pinMode(mainLEDPin, OUTPUT);        // sets the digital pin as output  
    pinMode(backLEDPin, OUTPUT);        // sets the digital pin as output  
    new BackgroundTask().start();       // starts the parallel blink task.
    while(true) {  
        loop();  
    }  
  }  
}  
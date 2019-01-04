# ThreadedBlink Java Running on Teensy 3.5

This VSCode/gradle project demonstrates a threaded Java application running bare metal
on a Teensy 3.5 using the Haiku JVM and the Teensyduino Arduino plugins.

## Dependencies

- Java 1.8 SDK or later
- [Arduino 1.8.8](https://www.arduino.cc/en/Main/Software) - you do not need to use the IDE
- [Teensyduino Addon](https://www.pjrc.com/teensy/td_download.html)
- [HaikuVM](https://github.com/chuckb/haikuVM) - I have modified the [original 1.4.3 version](http://haiku-vm.sourceforge.net/) to work with the Teensy 3.5
- [Realterm](https://sourceforge.net/projects/realterm/) - needed to display System.out.println messages from Teensy

## Building

- Install dependencies
- Put HaikuVM in c:\haikuVM
- Check out project
- Plug in Teensy (this has been tested on Windows 10)
- ./gradlew deploy
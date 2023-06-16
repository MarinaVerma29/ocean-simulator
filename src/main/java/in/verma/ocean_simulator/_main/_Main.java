package in.verma.ocean_simulator._main;
import in.verma.ocean_simulator.model.Shark;
import in.verma.ocean_simulator.util.EventSimulator;

public class _Main {

public static void main (String[]args){
    Shark shark = new Shark();
    EventSimulator eventSimulator = new EventSimulator();
    eventSimulator.startSimulation(shark);

}

}

import java.util.*;

public class DestinationFinder {
    //0 0
    // input="F 5 T 1 F 10 T 3 F 2";

    //produce the Queue of Commands from input data
    //Split the input
    //meke a Command Interface(class) with name and Step Attribute , (and execute methode .)
    //add all commands in queue
    //initiate the X,Y as StartPoint
    //find the Direction (X+,X-,Y+,Y-) with T commands
    //predefined Direction is X+(if input start with F means in X+ direction
    //fine the Movement amount with the steps of F
    //enhance the StartPoint with all commands
    //Say the final point

    public Collection<Integer> findEndPoint(String startPoint, String address) {

        List<Command> commands = produceTheCommandsQueue(address);
        Map<String, Integer> startCoordinate = initiateTheStartPoint(startPoint);
        Map<String, Integer> destination = findTheFinalDestination(commands, startCoordinate);
        return destination.values();

    }

    private List<Command> produceTheCommandsQueue(String address) {

        List<Command> commands = new ArrayList<>();
        List<String> splitedAddress = Arrays.asList(address.split(" "));
        Queue<String> addressLetter = new LinkedList<>(splitedAddress);
        for (String addres : addressLetter) {
            Command command = new Command(addressLetter.poll(), addressLetter.poll());
            commands.add(command);
        }
        return commands;
    }

    private Map<String, Integer> initiateTheStartPoint(String startPoint) {
        List<String> startCoordinate = Arrays.asList(startPoint.split(" "));
        Map<String, Integer> xyMap = new HashMap<>();
        Integer xVlue = Integer.parseInt(startCoordinate.get(0));
        Integer yVlue = Integer.parseInt(startCoordinate.get(1));
        xyMap.put("X", xVlue);
        xyMap.put("Y", yVlue);
        return xyMap;
    }

    private Map<String, Integer> findTheFinalDestination(List<Command> commands, Map<String, Integer> startCoordinate) {

        for (Command command : commands) {
            String nextDirection = defineNextDirection(commands);
            Integer nextMovement = finedMovemntAmount(commands);
            Map<String, Integer> coordinate = enhanceTheCoordinate(nextDirection, nextMovement, startCoordinate);
        }

        return null;
    }
}
// List<String> currentCoordinates = Arrays.asList(startPoint.split(" "));
//        String x = currentCoordinates.get(0);
//        String y = currentCoordinates.get(1);
//        Integer xCoordinate = Integer.parseInt(x);
//        Integer yCoordinate = Integer.parseInt(y);
//
//        List<Command> commandsList = splitCommands(address);
//
//        for (Command command : commandsList) {
//            if (command.getName().equals("T")){
//
//                if ((command.getSteps()%4)==1){
//                    addToYDirection(Integer steps);
//                }
//                else if ((command.getSteps()%4==2)){
//                    reduceFromX(Integer steps);
//                }
//                else if ((command.getSteps()%4)==3){
//                    reduceFromY(Integer steps);
//                }
//                else
//                {
//                    gotInDirection(Integer steps);
//            }
//
//            }
//           else if (command.getName().equals("F")){
//               command.getSteps();
//
//
//
//
//            }
//        }
//
//
//        String coordinate = "";
//        return coordinate;
//    }
//
//    private List<Command> splitCommands(String address) {
//        List<String> commandsLetter = Arrays.asList(address.split(" "));
//        Queue<String> commandQu = new LinkedList<>(commandsLetter);
//        List<Command> commands = new ArrayList<>();
//
//        while (commandQu.size() != 0) {
//            String command = commandQu.poll();
//            int step = Integer.parseInt(commandQu.poll());
//            Command command1 = new Command();
//            command1.setName(command);
//            command1.setSteps(step);
//        commands.add(command1);
//        }
//        return commands;
//    }



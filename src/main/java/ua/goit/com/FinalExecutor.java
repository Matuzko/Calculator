package ua.goit.com;

import ua.goit.com.calc_library.dataWithOperators.*;
import ua.goit.com.calc_library.mainLogic.Executor;
import ua.goit.com.calc_library.mainLogic.TaskParser;
import ua.goit.com.calc_library.operators.Operator;
import ua.goit.com.operandsWithOperator.*;

public class FinalExecutor implements Executor {

    Operator operator = null;

    public FinalExecutor() {
    }

    @Override
    public Operator operatorFinder(TaskParser taskParser) {
        Operator operator = null;
        if (taskParser.getOperator().equals("+")) {
            switch (taskParser.getType()) {
                case "i":
                    return new IntegerAdd(taskParser);
                case "l":
                    return new LongAdd(taskParser);
                case "d":
                    return new DoubleAdd(taskParser);
                case "f":
                    return new FloatAdd(taskParser);
            }
        }
        if (taskParser.getOperator().equals("-")) {
            switch (taskParser.getType()) {
                case "i":
                    return new IntegerSubstraction(taskParser);
                case "l":
                    return new LongSubstraction(taskParser);
                case "d":
                    return new DoubleSubstraction(taskParser);
                case "f":
                    return new FloatSubstraction(taskParser);
            }
        }
        if (taskParser.getOperator().equals("*")) {
            switch (taskParser.getType()) {
                case "i":
                    return new MultiplicatInteger(taskParser);
                case "l":
                    return new MultiplicatLong(taskParser);
                case "d":
                    return new MultiplicatDouble(taskParser);
                case "f":
                    return new MultipicatFloat(taskParser);
            }
        }
        if (taskParser.getOperator().equals("/")) {
            switch (taskParser.getType()) {
                case "i":
                    return new DiviseInteger(taskParser);
                case "l":
                    return new DiviseLong(taskParser);
                case "d":
                    return new DiviseDouble(taskParser);
                case "f":
                    return new DiviseFloat(taskParser);
            }
        }
        return null;
    }

    @Override
    public void execute(TaskParser taskParser) {
        operator = operatorFinder(taskParser);
        operator.call();
    }
}

package ua.goit.com.operandsWithOperator;

import ua.goit.com.operator.Divise;
import ua.goit.com.calc_library.mainLogic.TaskParser;

/**
 * Created by Dmitry on 16.07.2016.
 */
public class DiviseFloat implements Divise<Float> {

    Float operand1;
    Float operand2;
    TaskParser taskParser = null;

    public DiviseFloat(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Float.valueOf(taskParser.getFirstOperand());
        this.operand2 = Float.valueOf(taskParser.getSecondOperand());
    }

    public Float divise() {
        Float result = Float.valueOf(this.operand1.floatValue() / this.operand2.floatValue());
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    public Float call() {
        return this.divise();
    }
}

package ua.goit.com.operandsWithOperator;

import ua.goit.com.operator.Multiplicat;
import ua.goit.com.calc_library.mainLogic.TaskParser;

/**
 * Created by Dmitry on 16.07.2016.
 */
public class MultipicatFloat implements Multiplicat<Float> {

    Float operand1;
    Float operand2;
    TaskParser taskParser = null;

    public MultipicatFloat(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Float.valueOf(taskParser.getFirstOperand());
        this.operand2 = Float.valueOf(taskParser.getSecondOperand());
    }

    public Float multiplicat() {
        Float result = Float.valueOf(this.operand1.floatValue() * this.operand2.floatValue());
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    public Float call() {
        return this.multiplicat();
    }
}

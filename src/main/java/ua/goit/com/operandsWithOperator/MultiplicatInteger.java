package ua.goit.com.operandsWithOperator;

import ua.goit.com.operator.Multiplicat;
import ua.goit.com.calc_library.mainLogic.TaskParser;

/**
 * Created by Dmitry on 15.07.2016.
 */
public class MultiplicatInteger implements Multiplicat<Integer> {

    Integer operand1;
    Integer operand2;
    TaskParser taskParser = null;

    public MultiplicatInteger(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Integer.valueOf(taskParser.getFirstOperand());
        this.operand2 = Integer.valueOf(taskParser.getSecondOperand());
    }

    public Integer multiplicat() {
        Integer result = Integer.valueOf(this.operand1.intValue() * this.operand2.intValue());
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    public Integer call() {
        return this.multiplicat();
    }
}

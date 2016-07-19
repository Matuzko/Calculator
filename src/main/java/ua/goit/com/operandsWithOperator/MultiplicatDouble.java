package ua.goit.com.operandsWithOperator;

import ua.goit.com.operator.Multiplicat;
import ua.goit.com.calc_library.mainLogic.TaskParser;

/**
 * Created by Dmitry on 16.07.2016.
 */
public class MultiplicatDouble implements Multiplicat<Double> {

    Double operand1;
    Double operand2;
    TaskParser taskParser = null;

    public MultiplicatDouble(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Double.valueOf(taskParser.getFirstOperand());
        this.operand2 = Double.valueOf(taskParser.getSecondOperand());
    }

    public Double multiplicat() {
        Double result = Double.valueOf(this.operand1.doubleValue() * this.operand2.doubleValue());
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    public Double call() {
        return this.multiplicat();
    }
}

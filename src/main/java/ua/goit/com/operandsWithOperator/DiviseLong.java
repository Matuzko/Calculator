package ua.goit.com.operandsWithOperator;

import ua.goit.com.operator.Divise;
import ua.goit.com.calc_library.mainLogic.TaskParser;

/**
 * Created by Dmitry on 16.07.2016.
 */
public class DiviseLong implements Divise<Long> {
    Long operand1;
    Long operand2;
    TaskParser taskParser = null;

    public DiviseLong(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Long.valueOf(taskParser.getFirstOperand());
        this.operand2 = Long.valueOf(taskParser.getSecondOperand());
    }

    public Long divise() {
        Long result = Long.valueOf(this.operand1.longValue() / this.operand2.longValue());
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    public Long call() {
        return this.divise();
    }
}

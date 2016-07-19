package ua.goit.com.operandsWithOperator;

import ua.goit.com.operator.Multiplicat;
import ua.goit.com.calc_library.mainLogic.TaskParser;

public class MultiplicatLong implements Multiplicat<Long> {

    Long operand1;
    Long operand2;
    TaskParser taskParser = null;

    public MultiplicatLong() {

    }

    public MultiplicatLong(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Long.valueOf(taskParser.getFirstOperand());
        this.operand2 = Long.valueOf(taskParser.getSecondOperand());
    }

    public Long multiplicat() {
        Long result = Long.valueOf(this.operand1.longValue() * this.operand2.longValue());
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    public Long call() {
        return this.multiplicat();
    }

}

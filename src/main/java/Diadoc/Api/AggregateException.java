package Diadoc.Api;

import java.text.MessageFormat;

public class AggregateException extends Exception {
    private final Throwable[] m_innerExceptions;

    public AggregateException(String message, Throwable[] innerExceptions) {
        super(message);
        if (innerExceptions == null)
            throw new NullPointerException("innerExceptions");
        m_innerExceptions = innerExceptions;
    }

    @Override
    public String toString() {
        String text = super.toString();
        for (int i = 0; i < m_innerExceptions.length; i++){
            text = String.format("%s%s---> (Inner Exception #%s) %s%s%s", text, System7Emu.lineSeparator(), i, m_innerExceptions[i].toString(), "<---", System7Emu.lineSeparator());
        }
        return text;
    }
}
